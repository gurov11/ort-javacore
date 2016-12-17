package zzz2;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {

		Students[] student = new Students[Students.getNumberOfStudents()];
		student[0] = new Students("Дарья", "Жукова", "Игореевна", 11);
		student[1] = new Students("Татьяна", "Федорова", "Павловна", 21);
		student[2] = new Students("Василий", "Пупкин", "Андреевич", 21);
		student[3] = new Students("Виталий", "Романов", "Егорович", 11);
		student[4] = new Students("Вьячеслав", "Комиссаренко", "Павлович", 11);
		student[5] = new Students("Алексей", "Щербаков", "Семенович", 21);
		student[6] = new Students("Иван", "Абрамов", "Васильевич", 21);
		student[7] = new Students("Тимур", "Каргинов", "Рахматович", 11);
		student[8] = new Students("Юлия", "Ахмедова", "Олеговна", 21);
		student[9] = new Students("Лариса", "Прилова", "Валерьевна", 11);
		createAndFillArrayOfMarks(student, Students.getNumberOfStudents());
		appointmentOfGrant(student, Students.getNumberOfStudents());
/**
 * Сортирует массив студентов по номеру группы и фамилии
 */
		Arrays.sort(student, new CompByNumOfGroupAndSurname());
		for (int i = 0; i < Students.getNumberOfStudents(); i++) {
			System.out.println(student[i].toString());

		}

	}

	private static void createAndFillArrayOfMarks(Students[] st, int size) {
		for (int i = 0; i < size; i++) {
			st[i].createArrayOfMarks();
		}

	}

	private static void appointmentOfGrant(Students[] st, int size1) {
		for (int i = 0; i < size1; i++) {
			int sumOfMarks = 0;
			for (int q = 0; q < 5; q++) {
				sumOfMarks += st[i].getValueOfArray(q);
			}
			if (sumOfMarks == 25) {
				st[i].setGrant(100);
			}
			if (21 <= sumOfMarks && sumOfMarks <= 24) {
				st[i].setGrant(50);
			}
			if (sumOfMarks == 20) {
				st[i].setGrant(25);
			}
			if (sumOfMarks < 20) {
				st[i].setGrant(0);
			}
		}
	}
}
