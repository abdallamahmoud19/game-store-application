package com.araby.game_store_api.platform;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Set;

public interface PlatformRepository extends JpaRepository<Platform,String> {
    List<Platform> findAllByConsoleIn(List<Console> selectedConsoles);
}
