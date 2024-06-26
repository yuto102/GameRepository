package com.example.demo;
//GameController.java

import java.util.Random;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import entity.Game;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class GameController {

	@GetMapping("/api/games")
	@CrossOrigin
	public Game createGame() {
		System.out.println("create");
		Game game = new Game();
		int[] diceResults = new int[3];
		Random random = new Random();
		for (int i = 0; i < 3; i++) {
			diceResults[i] = random.nextInt(6) + 1; // サイコロの出目を1から6の間でランダムに決定
		}
		game.setDiceResults(diceResults);
		determineWinner(game);
		System.out.println("create");// 勝者を決定
		return game;
	}

	@PostMapping("/api/games")
	@CrossOrigin(origins = "http://localhost:3000")
	private Game determineWinner(Game game) {
		int[] diceResults = game.getDiceResults();
		int sum = diceResults[0] + diceResults[1] + diceResults[2];
		int winner = -1; // デフォルトは引き分け（-1）

		// ルールに従って勝者を決定する
		if (sum == 3 || sum == 18) {
			winner = 1; // 合計が3または18の場合、プレイヤー1が勝利
		} else if (sum % 2 == 0 && sum != 12) {
			winner = 2; // 合計が偶数でかつ12でない場合、プレイヤー2が勝利
		}

		game.setWinner(winner);
		return game;
	}
}
