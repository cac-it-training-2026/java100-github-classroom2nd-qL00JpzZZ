package lesson09.challenge04.Nurserry.logic;

import lesson09.challenge04.Nurserry.Exception.CriticalConditionException;

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

	public void takeTemperature(NurserySchoolChild child) throws CriticalConditionException {
		if (child.getTemperature() >= 38) {
			System.out.println("\n" + child.getName() + "は重体です。すぐに病院に行ってください。\n");
			throw new CriticalConditionException("体温が38度以上。");

		} else {
			System.out.println("\n" + child.getName() + "の体温は" + child.getTemperature() + "度です。\n");
		}
	}
	//ここに適切な処理を記述

}
