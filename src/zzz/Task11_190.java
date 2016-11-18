package zzz;

import java.util.Random;

public class Task11_190 {

	public static void main(String[] args) {
		Random rd = new Random();
		final int sizeOfNumber = 20;
		int[] firstTerm = new int[sizeOfNumber];
		int[] secondTerm = new int[sizeOfNumber];
		int[] sum = new int[sizeOfNumber];

		for (int i = 0; i < sizeOfNumber; i++) {
			firstTerm[i] = rd.nextInt(10);

		}
		System.out.print("firstTerm : ");
		for (int i = 0; i < sizeOfNumber; i++) {
			System.out.print(firstTerm[i]);
		}
		System.out.println();

		for (int i = 0; i < sizeOfNumber; i++) {
			secondTerm[i] = rd.nextInt(10);

		}
		System.out.print("secondTerm: ");
		for (int i = 0; i < sizeOfNumber; i++) {
			System.out.print(secondTerm[i]);
		}
		System.out.println();
		int r;
		for (int i = sizeOfNumber - 1; i >= 0; i--) {
			if (firstTerm[i] >= 10) {
				firstTerm[i] = firstTerm[i] % 10;
				firstTerm[i - 1] = firstTerm[i - 1] + firstTerm[i] / 10;
			}
			r = firstTerm[i] + secondTerm[i];
			if (i == 0) {
				if (r >= 10) {
					sum[i] = r % 10;

					System.out.print(r / 10);
					break;
				} else {
				}
			}

			if (r < 10) {
				sum[i] = r;
			} else {
				sum[i] = r % 10;
				firstTerm[i - 1] = firstTerm[i - 1] + (r / 10);
			}

		}

		for (int i = 0; i < sizeOfNumber; i++) {
			System.out.print(sum[i]);
		}

	}

}
