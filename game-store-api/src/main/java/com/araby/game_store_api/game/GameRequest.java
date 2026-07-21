package com.araby.game_store_api.game;

import com.araby.game_store_api.platform.Platform;

import java.util.List;
import java.util.Set;

public record GameRequest(
        String title ,
        String categoryId,
        List<String> platforms

) {
}
