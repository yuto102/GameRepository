package entity;

import java.util.Random;

import jakarta.persistence.Entity;

@Entity
public class Game {
	private Long id;

	public void setId(Long id) {
		this.id = id;
	}

	public int[] getDiceResults() {
		int[] diceResults = new int[3];
		Random random = new Random();
		for (int i = 0; i < 3; i++) {
			diceResults[i] = random.nextInt(6) + 1; // サイコロの出目を1から6の間でランダムに決定
		}
		return diceResults;
	}

	public void setWinner(int winner) {
		// 勝者を設定するためのメソッド
		// 実際の処理は必要に応じて追加してください
	}

	public void setDiceResults(int[] diceResults) {
		// ダイスの結果を設定するためのメソッド
		// 実際の処理は必要に応じて追加してください
	}

	// ゲームの情報を追加します（例：プレイヤー情報、結果など）

	// コンストラクタ、ゲッター、セッター
}
