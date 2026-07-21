package com.araby.game_store_api.category;

import com.araby.game_store_api.common.BaseEntity;
import com.araby.game_store_api.game.Game;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity
public class Category extends BaseEntity {
 private String name;
 @OneToMany(mappedBy = "category")
 private List<Game> games;
}
