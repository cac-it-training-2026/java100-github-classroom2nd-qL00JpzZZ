/**
 * 第7章 武士のお仕事
 *
 * 問題15 インターフェースを拡張する
 *
 * 国家老インターフェースを作る。
 *
 * 勘定奉行インターフェースと文化人インターフェースを継承した
 * 国家老インターフェースIChiefRetainer（メソッドvoid stay）を作り、
 * 藩士クラスに実装してください。
 *
 * <実行例>
 * 藩士1：
 * 藩の資産を計算するよ～。
 * 茶道を嗜むよ～。
 * 城で留守番するよ～。
 *
 */

package lesson07.challenge15;

interface IChiefTreasurer {
	public void figure();
}

interface ICelebrity {
	public void learn();
}

interface IChiefRetainer extends ICelebrity, IChiefTreasurer {
	public void stay();
}

class Samurai {

	void fight() {
		System.out.println("戦うよ～。");
	}

}

class Retainer extends Samurai implements IChiefRetainer {
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

	public void stay() {
		System.out.println("城で留守番するよ～。");
	}

	public void show() {
		figure();
		learn();
		stay();
	}
}

public class CastleTown {

	public static void main(String[] args) {
		System.out.println("藩士1：");

		Retainer ri = new Retainer();
		ri.show();

		//ここに適切な処理を記述;

	}
}
