/**
 * 第7章 武士のお仕事
 *
 * 問題7  toString()メソッドの利用
 *
 * toString()メソッドを適切にオーバーライドする。
 *
 * 問題4で作成した藩士クラスと問題5で作成した浪人クラスで
 * それぞれtoString()メソッドをオーバーライドし、<実行例>
 * と同じ結果になるように適切な処理記述しなさい。
 * （※Samuraiクラスにフィールドprotected String nameを追記）
 * （※藩士、浪人ともに名前はコンストラクタで設定する）
 * （※System.out.printlnを利用する）
 *
 * <実行例>
 * 藩士クラスのtoString()メソッドを確認します。
 *
 * 拙者は○△□藩士、テスト太郎ともうす。
 *
 * 浪人クラスのtoString()メソッドを確認します。
 *
 * 拙者は武州○△□村の浪人、テスト兵衛ともうす。
 *
 */

package lesson07.challenge07;

class Samurai {
	/**
	 * @param name
	 */
	public Samurai(String name) {
		this.name = name;
	}

	/**
	 * @param name セットする name
	 */

	protected String name;

	//ここにフィールドnameを記述

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
	public Retainer(String name) {
		super(name);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public String toString() {
		System.out.println("拙者は○△□藩士、" + name + "ともうす。");
		return name;
	}
}

//ここにRetainerクラスを記述
class Ronin extends Retainer {
	/**
	 * @param name
	 */
	public Ronin(String name) {
		super(name);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public String toString() {
		System.out.println("拙者は武州○△□村の浪人、" + name + "ともうす。");
		return name;
	}

}
//ここにRoninクラスを記述

public class CastleTown {

	public static void main(String[] args) {
		System.out.println("藩士クラスのtoString()メソッドを確認します。\n");

		Retainer ri = new Retainer("テスト兵衛");

		ri.toString();//ここに適切な処理を記述

		System.out.println("\n浪人クラスのtoString()メソッドを確認します。\n");

		Ronin ronin = new Ronin("テスト太郎");

		ronin.toString();//ここに適切な処理を記述

	}
}
