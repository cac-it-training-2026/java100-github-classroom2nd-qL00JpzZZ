package lesson09.challenge02.Nurserry.logic;

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
			System.out.println("1人" + (cakes / childs) + "個になります。");
		} catch (ArithmeticException e) {
			System.out.println("ケーキを食べる園児がいません。");
		}
		//ここに適切な処理を記述

	}
}
