package entity;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Game {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	public void setDiceResults(int[] diceResults) {
		// TODO 自動生成されたメソッド・スタブ

	}

	public int[] getDiceResults() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	public void setWinner(int winner) {
		// TODO 自動生成されたメソッド・スタブ

	}

	// ゲームの情報を追加します（例：プレイヤー情報、結果など）

	// コンストラクタ、ゲッター、セッター
}
