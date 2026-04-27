/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題5 合計金額を求める
 *
 * 入力されたマカロンの個数から合計購入数、合計金額を求めます。
 * 合計購入数、合計金額を求める処理を追記した後で
 * [問題4]の表示を実行例を参考にして改変してください。
 *
 * <実行例>
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >8
 * ショコラ      >2
 * ピスターシュ  >6
 *
 * シトロン     8個
 * ショコラ     2個
 * ピスターシュ 6個
 *
 * 合計個数    16個
 * 合計金額  4480円
 *
 * をお買いあげですね。
 * 承りました。
 *
 */

package lesson01.challenge05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int citron = 30, chocolate = 30, vistage = 30;
		int citron_value = 250, chocolate_value = 280, vistage_value = 320;

		System.out.println("大変お待たせしました。");
		System.out.println("【ポエール・ネルメ】");
		System.out.println("ただいまより開店です！！");

		System.out.println("本日のおすすめ商品です。\n");
		System.out.println("シトロン　　　￥250 ・・・ 残り" + citron + "個");
		System.out.println("ショコラ　　　￥280 ・・・ 残り" + chocolate + "個");
		System.out.println("ビスタージュ　￥320 ・・・ 残り" + vistage + "個");

		System.out.println("それぞれ何個ずつ買いますか？（最大30個まで）\n");

		System.out.print("シトロン");
		String str_citron = reader.readLine();
		System.out.print("ショコラ");
		String str_chocolate = reader.readLine();
		System.out.print("ビスタージュ");
		String str_vistage = reader.readLine();

		System.out.println("シトロン　　　" + str_citron + "個");
		System.out.println("ショコラ　　　" + str_citron + "個");
		System.out.println("ビスタージュ　" + str_citron + "個\n");

		System.out.println("合計個数　　"
				+ (Integer.parseInt(str_citron) + Integer.parseInt(str_chocolate) + Integer.parseInt(str_vistage))
				+ "個");
		System.out.println("合計金額　　" + (Integer.parseInt(str_citron) * citron_value
				+ Integer.parseInt(str_chocolate) * chocolate_value + Integer.parseInt(str_vistage) * vistage_value)
				+ "\n");

		System.out.println("をお買い上げですね。\n承りました。");

	}

}
