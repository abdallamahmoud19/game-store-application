package com.araby.game_store_api.game;

import com.araby.game_store_api.platform.Platform;
import lombok.*;

import java.util.Set;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GameResponse {
    private String Id;
    private String name;
    private Set<String> platforms;
    private String imageUrl; // the CDN Url

}
