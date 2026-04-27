package lesson05.challenge10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SuperRobot {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("小麦粉の量を入力してください（グラム）＞");
		int flourNum = Integer.parseInt(br.readLine());

		System.out.print("砂糖の量を入力してください（グラム）＞");
		int sugarNum = Integer.parseInt(br.readLine());

		System.out.print("卵の個数を入力してください＞");
		int eggNum = Integer.parseInt(br.readLine());

		System.out.print("バターの量を入力してください（グラム）＞");
		int butterNum = Integer.parseInt(br.readLine());

		SuperRobot robot = new SuperRobot();

		String result = robot.makeLuxuryDish(flourNum, sugarNum, eggNum, butterNum);

		System.out.println(result);
	}

	public String makeLuxuryDish(int flourNum, int sugarNum, int eggNum, int butterNum) {

		if (flourNum >= 200 && sugarNum >= 100 && eggNum >= 3 && butterNum >= 100) {
			return "特製ホールケーキが出来ました。";
		} else if (eggNum >= 5 && butterNum >= 50) {
			return "高級オムレツが出来ました。";
		} else if (sugarNum >= 80 && butterNum >= 80) {
			return "バタークッキーが出来ました。";
		} else {
			return "豪華な料理は作れませんでした。";
		}
	}
}