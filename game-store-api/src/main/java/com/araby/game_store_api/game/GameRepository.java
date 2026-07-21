package com.araby.game_store_api.game;

import com.araby.game_store_api.category.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GameRepository extends JpaRepository<Game, String> {
    // find all games by category (v1)
    List<Game> findAllByCategory(Category category);

    // find all games by category (v2)
    List<Game> findAllByCategoryId(String categoryId);


    List<Game> findAllByCategoryName(String categoryName);

    boolean existsByTitle(String title);
}
