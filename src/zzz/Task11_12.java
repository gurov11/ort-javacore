package zzz;

public class Task11_12 {

	public static void main(String[] args) {
		int[] mas = new int[20];
		int m =0;
		for(int i = 300; m<20;i++ ){
			if((i%13==0)||(i%17==0)){
				mas[m]=i;
				System.out.print(mas[m]+" | ");
				m++;
			}
			else continue;
		}
		m =0;
		System.out.println();
		// á)
		int[] mas2 = new int[30];
		
		int count = 0;
		for(int i = 2; m<30;i++){
			for(int q=i;q>0;q--){
				if(i%q==0){count ++;}
				}
			if(count == 2){mas2[m]=i;System.out.print(mas2[m]+" | ");m++;}		
		count=0;
		}
	
	
	
	}

}
