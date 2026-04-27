package lesson09.challenge03.Nurserry.logic;

public class Nurse {
	private String name;

	public Nurse(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void divide(int cakes, int childs) {

		try {
			System.out.println("1人" + (cakes / childs) + "個になります。\nケーキの分配が終わりました。");
		} catch (ArithmeticException e) {
			System.out.println("ケーキを食べる園児がいません。\nケーキの分配が終わりました。");
		}
		//ここに適切な処理を記述

	}
}
