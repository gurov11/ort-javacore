package zzz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task9_154 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numberOfDiffLetters = 0;

		String word = br.readLine();
		br.close();
		char[] mas = word.toCharArray();

		for (int i = 1; i < mas.length; i++) {
			if (mas[0] != mas[i]) {
				numberOfDiffLetters++;
			}

		}

		numberOfDiffLetters++;
		System.out.println(numberOfDiffLetters);
	}

}
