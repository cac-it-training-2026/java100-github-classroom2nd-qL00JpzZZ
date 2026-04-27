/**
 * 第7章 武士のお仕事
 *
 * 問題13 インターフェース②
 *
 * 文化人インターフェースを作る。
 *
 * 抽象メソッドlearn()を持つ文化人インターフェースICelebrityを
 * 作成し、藩士クラスと浪人クラスにそれぞれ実装し、<実行例>と
 * 同じメッセージを表示してください。
 *
 * <実行例>
 * 藩士1：
 * 茶道を嗜むよ～。
 *
 * 浪人1：
 * 塾を開くよ～。
 *
 *
 */

package lesson07.challenge13;

interface ICelebrity {
	public void learn();
}

class Samurai {

	void fight() {
		System.out.println("戦うよ～。");
	}

}

class Retainer extends Samurai implements ICelebrity {
	public void getPaid() {
		fight();
		System.out.println("給料をもらうよ～");
	}

	public void learn() {
		System.out.println("茶道を嗜むよ～。");
	}
}

class Ronin extends Samurai implements ICelebrity {

	public void learn() {
		System.out.println("塾を開くよ～。");
	}

}
//ここに問題1で作成したRetainerクラスを記述

public class CastleTown {

	public static void main(String[] args) {
		System.out.println("藩士1：");

		Retainer rd = new Retainer();

		rd.learn();

		//ここに適切な処理を記述

		System.out.println("\n浪人1：");

		Ronin rn = new Ronin();

		rn.learn();

		//ここに適切な処理を記述

	}
}
