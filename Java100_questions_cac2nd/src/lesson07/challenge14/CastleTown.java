/**
 * 第7章 武士のお仕事
 *
 * 問題14 複数のインターフェースを実装する
 *
 * 勘定奉行インタフェース、文化人インターフェースを実装する。
 *
 * 藩士クラスに勘定奉行インターフェースと文化人インターフェースを
 * 実装してください。
 *
 * <実行例>
 * 藩士1：
 * 藩の資産を計算するよ～。
 * 茶道を嗜むよ～。
 *
 */

package lesson07.challenge14;

//ここにIChiefTreasurerインターフェースを記述
interface IChiefTreasurer {
	public void figure();
}

interface ICelebrity {
	public void learn();
}

class Samurai {

	void fight() {
		System.out.println("戦うよ～。");
	}

}

class Retainer extends Samurai implements ICelebrity, IChiefTreasurer {
	public void getPaid() {
		fight();
		System.out.println("給料をもらうよ～");
	}

	public void learn() {
		System.out.println("茶道を嗜むよ～。");
	}

	public void figure() {
		System.out.println("藩の資産を計算するよ～。");
		// TODO 自動生成されたメソッド・スタブ

	}
}

public class CastleTown {

	public static void main(String[] args) {
		System.out.println("藩士1：");
		Retainer ri = new Retainer();

		ri.figure();
		ri.learn();
		//ここに適切な処理を記述;

	}
}
