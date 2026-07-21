package com.araby.game_store_api.game;


import com.araby.game_store_api.category.CategoryRepository;
import com.araby.game_store_api.common.PageResponse;
import com.araby.game_store_api.gamerequest.GameRequestEntity;
import com.araby.game_store_api.platform.Console;
import com.araby.game_store_api.platform.Platform;
import com.araby.game_store_api.platform.PlatformRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.query.Page;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;



@Service
@RequiredArgsConstructor
@Slf4j
public class GameService {
    private final GameRepository gameRepository;
    private final PlatformRepository platformRepository;

    private final GameMapper gameMapper;
    private final CategoryRepository categoryRepository;



    public String saveGame( final GameRequest gameRequest) {

        if(gameRepository.existsByTitle(gameRequest.title())){
            throw new RuntimeException("Game Title already exists");

        }


        final List<Console>selectedConsoles = gameRequest.platforms()
                .stream()
                .map(Console::valueOf)
                .toList();

       final List<Platform> platforms = platformRepository.findAllByConsoleIn(selectedConsoles);

       if(platforms.size() != selectedConsoles.size()){
           log.warn("Recevied a non selected platforms. Recevied {} - Stored: {}", selectedConsoles ,platforms);
           throw new RuntimeException("Recevied a non selected platforms");
       }
        if(!categoryRepository.existsById(gameRequest.categoryId())) {
            log.warn("Received a category id that doesn't exist : {}", gameRequest.categoryId());
            throw new RuntimeException("Received a category id that doesn't exist");
        }

        Game game = gameMapper.toGame(gameRequest);
        game.setPlatforms(platforms);
        final Game savedGame = gameRepository.save(game);

        return savedGame.getId();}

    public void deleteGame(String gameId) {}

    public void updateGame(String gameId, GameRequest gameRequest) {}
    public String uploadGameImage(MultipartFile file, String gameId) {return null;}
    public PageResponse<GameResponse> findAllGame(int page, int pageSize) {return null;}


}
