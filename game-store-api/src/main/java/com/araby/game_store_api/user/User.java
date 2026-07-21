package com.araby.game_store_api.user;


import com.araby.game_store_api.common.BaseEntity;
import com.araby.game_store_api.gamerequest.GameRequestEntity;
import com.araby.game_store_api.notification.Notification;
import com.araby.game_store_api.wishlist.WishList;
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
@Table(name = "_user")
public class User extends BaseEntity {
    private String firstName;
    private String lastName;
    private String email;
    private String profilePictureUrl;

    @OneToOne(mappedBy = "user")
    @JoinColumn(name = "wish_list_id")
    private WishList wishList;

    @OneToMany(mappedBy = "user")
    private List<Notification> notifications;

    @OneToMany(mappedBy = "user")
    private List<GameRequestEntity> gameRequestEntities;
}
