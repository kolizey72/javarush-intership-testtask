package com.game.service;

import com.game.entity.Player;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;
import java.util.NoSuchElementException;

public interface PlayerService {

    public List<Player> getPlayersList(Specification<Player> spec, Pageable pageable);

    Integer getPlayersCount(Specification<Player> spec);

    Player createPlayer(Player player);

    Player getPlayer(Long id) throws NoSuchElementException;

    Player updatePlayer(Player player);

    void deletePlayer(Long id);
}
