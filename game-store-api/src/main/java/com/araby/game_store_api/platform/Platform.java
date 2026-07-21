package com.araby.game_store_api.platform;

import com.araby.game_store_api.common.BaseEntity;
import com.araby.game_store_api.game.Game;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.List;
@Entity
public class Platform extends BaseEntity {
    @Enumerated(EnumType.STRING)
    private Console console;
    @ManyToMany(mappedBy = "platforms")
    private List<Game> Stores ;

}
