package com.devtest.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devtest.dslist.dto.GameDto;
import com.devtest.dslist.dto.GameMinDto;
import com.devtest.dslist.entities.Game;
import com.devtest.dslist.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	public GameDto findById(Long id) {
		Game result = gameRepository.findById(id).get();
		return new GameDto(result);
	}
	
	public List<GameMinDto> findAll() {
		List<Game> result = gameRepository.findAll();
		List<GameMinDto> dto = result.stream().map(x -> new GameMinDto(x)).toList();
		return dto;
	}
}
