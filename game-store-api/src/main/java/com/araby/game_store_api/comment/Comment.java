package com.araby.game_store_api.comment;

import com.araby.game_store_api.common.BaseEntity;
import com.araby.game_store_api.game.Game;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Comment extends BaseEntity {
    private String comment;
    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game game;
}
