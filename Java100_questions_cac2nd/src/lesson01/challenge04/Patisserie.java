/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題4 注文を受ける
 *
 * 3種類のマカロンを任意の個数購入できるようにします。
 * [問題3]までの表示を行った後で
 * 実行例を参考に処理を追記してください。
 * （ >8 は >を表示した後で入力待ち状態になり、
 *   ユーザーがキーボードから8を入力したイメージです。）
 *
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
 * をお買いあげですね。
 * 承りました。
 */

package lesson01.challenge04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int citron = 30, chocolate = 30, vistage = 30;

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
		System.out.println("ビスタージュ　　" + str_citron + "個\n");
		System.out.println("をお買い上げですね。\n承りました。");
	}
}
