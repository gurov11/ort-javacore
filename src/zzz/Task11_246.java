package zzz;

import java.util.Random;

public class Task11_246 {

	public static void main(String[] args) {
		Random rd = new Random();
		int[] mas = new int[20];
		int[] mas2 = new int[20];

		for (int i = 0; i < 20; i++) {
			mas[i] = rd.nextInt(40) - 20;
			System.out.print(mas[i] + " | ");

		}

		System.out.println();
		int m = 0;
		int n = 0;
		for (int i = 0; (n + m) < 20; i++) {
			if (mas[i] < 0) {
				mas2[n] = mas[i];
				n++;
			} else {
				mas2[20 - 1 - m] = mas[i];
				m++;
			}
		}

		for (int i = 0; i < 20; i++) {

			System.out.print(mas2[i] + " | ");

		}
	}

}
