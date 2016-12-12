package zzz2;

import java.util.Arrays;

public class Students {
	private final static int numberOfStudents = 10;
	private String surname;
	private String name;
	private String patronymic;
	private int numberOfGroup;
	private int[] marks;
	private int grants;

	public Students(String surname, String name, String patronymic, int numberOfGroup) {
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.numberOfGroup = numberOfGroup;
	}
/**
 * Метод генерирует массив оценок.
 */
	public void createArrayOfMarks() {
		this.marks = new int[5];
		for (int i = 0; i < 5; i++) {
			this.marks[i] = (int) (3 + Math.random() * 3);
		}

	}

	public int getValueOfArray(int b) {
		return this.marks[b];

	}

	public static int getNumberOfStudents() {
		return numberOfStudents;
	}

	public void setGrant(int b) {
		this.grants = b;
	}

	public int getGrant() {
		return this.grants;
	}

	public int numberOfGroup() {
		return this.numberOfGroup;
	}

	public String getSurname() {
		return this.surname;
	}

	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append(this.surname).append(" ").append(this.name).append(" ").append(this.patronymic).append(" (")
				.append(this.numberOfGroup).append("-группа. Оценки - ").append(Arrays.toString(this.marks))
				.append(" Стипендия: ").append(this.getGrant()).append("%");
		return str.toString();
	}

}
