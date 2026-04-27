/**
 * 第7章 武士のお仕事
 *
 * 問題11 instanceof演算子
 *
 * instanceof演算子を利用する。
 *
 * 侍クラスの配列に（藩士、浪人）をランダムに入れ、
 * それぞれの人数を表示してください。
 *
 * <実行例>
 * 5人の侍を配列に詰めます。
 *
 * 詰め終わりました。
 *
 * それぞれの人数を表示してみます。
 *
 * 藩士：3人
 *
 * 浪人：2人
 *
 */

package lesson07.challenge11;

class Samurai {

	/**
	 * @param name
	 */

	protected String name;

	void fight() {
		System.out.println("戦うよ～。");
	}

	void work() {
		System.out.println("何かして働くよ～");
	}

}

class Retainer extends Samurai {

	/**
	 * 
	 */
	public Retainer() {
		super();
		// TODO 自動生成されたコンストラクター・スタブ
	}

}

class Ronin extends Samurai {

	/**
	 * 
	 */
	public Ronin() {
		super();
		// TODO 自動生成されたコンストラクター・スタブ
	}

}

public class CastleTown {

	public static void main(String[] args) {
		System.out.println("5人の侍を配列に詰めます。\n");

		Samurai[] sm = new Samurai[5];
		int flag = 0;

		for (int i = 0; i < sm.length; i++) {
			flag = (int) (Math.random() * 2) + 1;
			if (flag > 1) {
				sm[i] = new Retainer();
			} else {
				sm[i] = new Ronin();
			}
		}
		//ここに適切な処理を記述

		System.out.println("詰め終わりました。\n");
		System.out.println("それぞれの人数を表示してみます。\n");

		int retainerCount = 0;
		int roninCount = 0;

		for (int i = 0; i < sm.length; i++) {
			if (sm[i] instanceof Retainer) {
				retainerCount++;
			} else {
				roninCount++;
			}
		}

		//ここに適切な処理を記述

		System.out.println("藩士：" + retainerCount + "人");
		System.out.println("\n浪人：" + roninCount + "人");
	}
}
