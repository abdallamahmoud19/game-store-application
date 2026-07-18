package com.araby.game_store_api.wishlist;

import com.araby.game_store_api.common.BaseEntity;
import com.araby.game_store_api.game.Game;
import com.araby.game_store_api.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class WishList extends BaseEntity {
    private String name;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToMany(mappedBy = "wishLists",fetch = FetchType.EAGER)
    private List<Game> games;
}
