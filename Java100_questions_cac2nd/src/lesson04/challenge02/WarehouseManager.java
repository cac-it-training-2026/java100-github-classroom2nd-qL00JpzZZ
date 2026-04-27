/**
 * 第4章 倉庫番のお仕事
 *
 * 問題2  倉庫管理の基礎②
 *
 * XO商事に入社して2日目を迎えたYさん。
 * 研修は徐々に難しくなります。
 *
 * コメントの位置に適切なコードを記述し、
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  Z先輩：
 *  それではこれより新人研修の第2回目を始めます。
 *
 *  Yさん：
 *  はい、よろしくお願いします。
 *
 *  Z先輩：
 *  今回の研修では、配列の要素を予め決めておくことはせず、
 *  お客様のご要望にお答えする形にします。
 *
 *  Yさん：
 *  はい、わかりました。
 *
 *  Z先輩：
 *  あ、お客様がご来店だ!
 *
 *  Z先輩：
 *  いらっしゃいませ、ご要望をどうぞ。
 *
 *  データ型を選んでください（1...文字、2...文字列、3...数値）＞○
 *
 *  要素数を選んでください（1...1個、2...2個、3...3個）＞○
 *
 *  Z先輩：
 *  中に入れる値はおまかせという事でよろしいですね。
 *  ご注文を承りました。
 *
 *  Z先輩：
 *  Yさん、作成をお願いしてもいいかな？
 *
 *  Yさん：
 *  はい、作成させていただきます。
 *
 *  Yさん：
 *  ...出来ました。
 *
 *  Z先輩：
 *  試しに最後の値を見せてください。
 *
 *  Yさん：
 *  【※ここに値を出力】です。
 *
 *  Z先輩：
 *  はい、ありがとう。ちゃんと出来てますね。
 *
 *
 * <範囲外の数値を入力された場合の実行例>
 *
 *  Z先輩：
 *  そのような選択肢はありません。
 *
 */

package lesson04.challenge02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WarehouseManager {

	public static void main(String[] args) throws IOException {

		System.out.println("Z先輩：");
		System.out.println("それではこれより新人研修の第2回目を始めます。\n");
		System.out.println("Yさん：");
		System.out.println("はい、よろしくお願いします。\n");

		System.out.println("Z先輩：");
		System.out.println("今回の研修では、配列の要素を予め決めておくことはせず、");
		System.out.println("お客様のご要望にお答えする形にします。\n");

		System.out.println("Yさん：");
		System.out.println("はい,わかりました。\n");

		System.out.println("Z先輩：");
		System.out.println("あ、お客様がご来店だ!\n");

		System.out.println("Z先輩：");
		System.out.println("いらっしゃいませ、ご要望をどうぞ。\n");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("データ型を選んでください（1...文字、2...文字列、3...数値）＞");

		String str = br.readLine();
		int ans1 = (int) Double.parseDouble(str);//ここに入力処理を記述する。

		System.out.print("\n要素数を選んでください（1...1個、2...2個、3...3個）＞");
		str = br.readLine();
		int ans2 = (int) Double.parseDouble(str);

		boolean errFlag = false;

		if (ans1 < 1 || ans1 > 3) {
			errFlag = true;
		}

		if (ans2 < 1 || ans2 > 3) {
			errFlag = true;
		}

		if (!errFlag) {
			System.out.println("\nZ先輩：");
			System.out.println("中に入れる値はおまかせという事でよろしいですね。");
			System.out.println("ご注文を承りました。\n");

			System.out.println("Z先輩：");
			System.out.println("Yさん、作成をお願いしてもいいかな？\n");

			System.out.println("Yさん：");
			System.out.println("はい、作成させていただきます。\n");

			char[] charArray = null;
			String[] strArray = null;
			int[] intArray = null;

			if (ans1 == 1) {
				switch (ans2) {
				case 1:
					charArray = new char[1];
					break;
				case 2:
					charArray = new char[2];
					break;
				case 3:
					charArray = new char[3];
					break;
				}//ここに入力値による分岐および配列要素数の確定、
			} else if (ans1 == 2) {
				switch (ans2) {
				case 1:
					strArray = new String[1];
					break;
				case 2:
					strArray = new String[2];
					break;
				case 3:
					strArray = new String[3];
					break;
				}

			} else if (ans1 == 3) {
				switch (ans2) {
				case 1:
					intArray = new int[1];
					break;
				case 2:
					intArray = new int[2];
					break;
				case 3:
					intArray = new int[3];
					break;
				}

			}
			if (ans1 == 1) {
				for (int i = 0; i < charArray.length; i++) {
					charArray[i] = 'i';

				}

			} else if (ans1 == 2) {
				for (int i = 0; i < strArray.length; i++) {
					strArray[i] = "hello";

				}

			} else if (ans1 == 3) {
				for (int i = 0; i < intArray.length; i++) {
					intArray[i] = i + 1;

				}

			}

			//値の代入処理を記述する。

			System.out.println("Yさん：");
			System.out.println("...出来ました。\n");

			System.out.println("Z先輩：");
			System.out.println("試しに最後の値を見せてください。\n");

			System.out.println("Yさん：");

			if (ans1 == 1) {
				for (int i = 0; i < charArray.length; i++) {
					System.out.println(charArray[i]);
				}
				//ここに入力値による分岐および配列要素の表示処理を記述する。
			} else if (ans1 == 2) {
				for (int i = 0; i < strArray.length; i++) {
					System.out.println(strArray[i]);
				}

			} else if (ans1 == 3) {
				for (int i = 0; i < intArray.length; i++) {
					System.out.println(intArray[i]);
				}

			}

			System.out.println("です。\n");

			System.out.println("Z先輩：");
			System.out.println("はい、ありがとう。ちゃんと出来てますね。\n");
		} else {
			System.out.println("\nZ先輩：");
			System.out.println("そのような選択肢はありません。");
		}
	}
}
