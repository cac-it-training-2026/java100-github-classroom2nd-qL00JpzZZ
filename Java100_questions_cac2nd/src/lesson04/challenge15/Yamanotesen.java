package lesson04.challenge15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Yamanotesen {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String[] stations = {
				"東京", "新宿", "新橋", "御徒町", "五反田", "秋葉原", "浜松町", "渋谷", "田町", "恵比寿",
				"有楽町", "目黒", "大崎", "原宿", "品川", "目白", "大塚", "上野", "池袋", "日暮里",
				"西日暮里", "駒込", "田端", "高田馬場", "神田", "鶯谷", "代々木", "新大久保", "巣鴨", "高輪ゲートウェイ"
		};

		boolean[] used = new boolean[stations.length];
		int usedCount = 0;

		System.out.println("※※※ 山手線ゲーム ※※※\n");
		System.out.println("      ゲームスタート！\n");

		while (true) {

			String input = reader.readLine();

			int index = -1;
			for (int i = 0; i < stations.length; i++) {
				if (stations[i].equals(input)) {
					index = i;
					break;
				}
			}

			if (index == -1) {
				System.out.println("あなたの負けです！");
				break;
			}

			if (used[index]) {
				System.out.println("あなたの負けです！");
				break;
			}

			used[index] = true;
			usedCount++;

			if (usedCount == stations.length) {
				System.out.println("あなたの勝ちです！");
				break;
			}

			for (int i = 0; i < stations.length; i++) {
				if (!used[i]) {
					System.out.println(stations[i]);
					used[i] = true;
					usedCount++;
					break;
				}
			}

		}
	}
}
