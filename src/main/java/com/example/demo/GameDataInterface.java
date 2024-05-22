package com.example.demo;

import java.util.List;

import entity.Game;

public interface GameDataInterface {
	List<Game> getAllGames();

	Game createGame();
}
