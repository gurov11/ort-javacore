package zzz;

import java.util.Random;

public class Task11_104 {

	public static void main(String[] args) {
		Random rd = new Random();
		int[] mas = new int[20];
        int numberOfIdenticalElements=0;
		int numberOfDifferentElements=0;
        System.out.print(mas[0] + " | ");
		for (int i = 0; i < 20; i++) {
			if (i == 0) {
				mas[i] = rd.nextInt(15);
				System.out.print(mas[i] + " | ");
				continue;
			}

			mas[i] = rd.nextInt(30) + mas[i - 1];
			System.out.print(mas[i] + " | ");

		}
		System.out.println();
		for (int i = 0; i < 19; i++) {
				
				if(mas[i]==mas[i+1]&&mas[i]!=mas[i-1]){numberOfIdenticalElements+=2;}
				else{if(mas[i]==mas[i+1]&&mas[i]==mas[i-1]){numberOfIdenticalElements++;} }
		
		}
		numberOfDifferentElements=20-numberOfIdenticalElements;
		
	System.out.println("numberOfIdenticalElements: "+numberOfIdenticalElements);
	System.out.println("numberOfDifferentElements: "+numberOfDifferentElements);
	}

}
