/**
 * 第7章 武士のお仕事
 *
 * 問題10  抽象クラス
 *
 * 抽象クラス、抽象メソッドを作る。
 *
 * 侍クラスのwork()メソッドを抽象化してください。
 *
 * <実行例>
 * 侍は働きます。
 *
 * 具体的に言うと藩士は年貢を取り立てます。
 *
 * 藩士1：
 * 年貢を取り立てるよ～。
 *
 * 具体的に言うと浪人は傘張りをします。
 *
 * 浪人1：
 * 傘張るよ～。
 *
 */

package lesson07.challenge10;

//ここにSamuraiクラスを記述
abstract class Samurai {
	abstract void work();
}

class Retainer extends Samurai {
	@Override
	void work() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("年貢を取り立てるよ～。");
	}
}

//ここにRetainerクラスを記述
class Ronin extends Samurai {
	@Override
	void work() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("傘張るよ～。");
	}
}

//ここにRoninクラスを記述

public class CastleTown {

	public static void main(String[] args) {
		System.out.println("侍は働きます。");

		System.out.println("\n具体的に言うと藩士は年貢を取り立てます。\n");

		System.out.println("藩士1：");

		Retainer rt = new Retainer();

		rt.work();

		//ここに適切な処理を記述

		System.out.println("\n具体的に言うと浪人は傘張りをします。\n");

		System.out.println("浪人1：");

		Ronin rn = new Ronin();

		rn.work();

		//ここに適切な処理を記述

	}
}
