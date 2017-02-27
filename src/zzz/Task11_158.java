package zzz;
import java.util.Random;
public class Task11_158 {

	public static void main(String[] args) {
		Random rd = new Random();
		int[] mas = new int[20];
		for (int i = 0; i < 20; i++) {
			mas[i] = rd.nextInt(25);
			System.out.print(mas[i]+" | ");
		}
		System.out.println();
		System.out.println();
		for (int i = 0; i < 20; i++) {
			for(int q=0;q<20;q++){
				if(i==q){continue;}
				else if(mas[i]==mas[q]){mas[q]=0;}
			}
			System.out.print(mas[i]+" | ");
		}
	}

}
