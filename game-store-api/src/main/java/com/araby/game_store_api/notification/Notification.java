package com.araby.game_store_api.notification;

import com.araby.game_store_api.common.BaseEntity;
import com.araby.game_store_api.user.User;
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
public class Notification  extends BaseEntity {

    private String message;
    private String receiver;
    private NotificationStatus status;
    private NotificationLevel level;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


}
