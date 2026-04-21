/**
 * 第4章 倉庫番のお仕事
 *
 * 問題6 荷物の入れ替え
 *
 * AB興産から今度は荷物の入れ替えの依頼をいただきました。
 * 5袋ある荷物のうち、1が入っている袋と3が入っている袋を
 * 探して値を入れ替え、2が入っている袋と4が入っている袋を
 * 探して値を入れ替える必要があります。
 *
 * 袋にはそれぞれ1～5の数値が入っており、
 * どの袋にどの数値が入っているのかはランダムに決定します。
 * さらにそれぞれの袋の値が重複しないものとします。
 *
 * コメントの位置に適切なコードを記述し、
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  E主任：
 *  AB興産の荷物の入れ替えをお願いします。
 *
 *  Yさん：
 *  はい、
 *  入れ替え前の状態は、
 *  3,2,1,5,4
 *  です。
 *
 *  入れ替え後の状態は、
 *  1,4,3,5,2
 *  です。
 *
 */

package lesson04.challenge06;

public class WarehouseManager {

	public static void main(String[] args) {

		int[] ABKosanArray = new int[5];

		for (int i = 0; i < ABKosanArray.length; i++) {
			ABKosanArray[i] = 0;
		}

		//ここに配列の宣言を記述する

		int intputNum = 0;
		boolean loopFlag = false;
		int i = 0;

		while (!loopFlag) {
			intputNum = (int) (Math.random() * 5);
			if (ABKosanArray[intputNum] == 0) {
				ABKosanArray[intputNum] = i + 1;
				i++;
			}

			loopFlag = true;
			for (int j = 0; j < ABKosanArray.length; j++) {
				if (ABKosanArray[j] == 0) {
					loopFlag = false;
					break;
				}
			}

		} //ここに重複チェックおよび値の代入処理を記述する

		System.out.println("E主任：");
		System.out.println("AB興産の荷物の入れ替えをお願いします。\n");

		System.out.println("Yさん：");
		System.out.println("はい、");
		System.out.println("入れ替え前の状態は、");
		for (int j = 0; j < ABKosanArray.length; j++) {
			System.out.print(ABKosanArray[j]);
			if (j != (ABKosanArray.length - 1)) {
				System.out.print(",");
			}
		}
		System.out.println("\nです。\n");

		int idx1 = -1;
		int idx3 = -1;

		for (int j = 0; j < ABKosanArray.length; j++) {
			if (ABKosanArray[j] == 1)
				idx1 = j;
			if (ABKosanArray[j] == 3)
				idx3 = j;
		}

		int temp = ABKosanArray[idx1];
		ABKosanArray[idx1] = ABKosanArray[idx3];
		ABKosanArray[idx3] = temp;

		int idx2 = -1;
		int idx4 = -1;

		for (int j = 0; j < ABKosanArray.length; j++) {
			if (ABKosanArray[j] == 2)
				idx2 = j;
			if (ABKosanArray[j] == 4)
				idx4 = j;
		}

		temp = ABKosanArray[idx2];
		ABKosanArray[idx2] = ABKosanArray[idx4];
		ABKosanArray[idx4] = temp;

		//ここに値の入れ替え処理を記述する

		System.out.println("入れ替え後の状態は、");
		for (int j = 0; j < ABKosanArray.length; j++) {
			System.out.print(ABKosanArray[j]);
			if (j != (ABKosanArray.length - 1)) {
				System.out.print(",");
			}
		}
		System.out.println("\nです。");

	}
}
