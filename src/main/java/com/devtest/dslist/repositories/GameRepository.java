package com.devtest.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devtest.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
