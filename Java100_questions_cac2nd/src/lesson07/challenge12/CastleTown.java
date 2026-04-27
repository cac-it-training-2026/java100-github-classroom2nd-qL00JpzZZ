/**
 * 第7章 武士のお仕事
 *
 * 問題12 インターフェース①
 *
 * 勘定奉行インターフェースを作る。
 *
 * 抽象メソッドfigure()を持つ勘定奉行インターフェースIChiefTreasurerを
 * 作成し、問題3で作成した奉行クラスMagistrateに実装してください。
 *
 * <実行例>
 * 奉行に勘定奉行を兼ねてもらうことになりました。
 *
 * 奉行1：
 * 藩の資産を計算するよ～。
 *
 */

package lesson07.challenge12;

//ここにIChiefTreasurerインターフェースを記述
interface IChiefTreasurer {
	public void figure();
}

class Samurai {

	void fight() {
		System.out.println("戦うよ～。");
	}

}

class Retainer extends Samurai {
	public void getPaid() {
		fight();
		System.out.println("給料をもらうよ～");
	}
}

//ここに問題1で作成したRetainerクラスを記述

class Magistrate extends Retainer implements IChiefTreasurer {
	public void judge() {
		getPaid();
		System.out.println("判決を下すよ～。");
	}

	@Override
	public void figure() {
		System.out.println("藩の資産を計算するよ～。");
		// TODO 自動生成されたメソッド・スタブ

	}

}

public class CastleTown {

	public static void main(String[] args) {
		System.out.println("奉行に勘定奉行を兼ねてもらうことになりました。\n");

		System.out.println("奉行1：");

		Magistrate mg = new Magistrate();

		mg.figure();

		//ここに適切な処理を記述

	}
}
