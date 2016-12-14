package task11;
import java.util.Arrays;
import java.util.Comparator;
public class Main {

	public static void main(String[] args) {
		Employee[] empoloyee = new  Employee[10];
		empoloyee[0] = new WorkerWithSalaryPerHour(Constants.FIO);
		empoloyee[1] = new WorkerWithFixedSalary(Constants.FIO2);
		empoloyee[2] = new WorkerWithSalaryPerHour(Constants.FIO3);
		empoloyee[3] = new WorkerWithFixedSalary(Constants.FIO4);
		empoloyee[4] = new WorkerWithFixedSalary(Constants.FIO5);
		empoloyee[5] = new WorkerWithSalaryPerHour(Constants.FIO6);
		empoloyee[6] = new WorkerWithFixedSalary(Constants.FIO7);
		empoloyee[7] = new WorkerWithSalaryPerHour(Constants.FIO8);
		empoloyee[8] = new WorkerWithFixedSalary(Constants.FIO9);
		empoloyee[9] = new WorkerWithFixedSalary(Constants.FIO10);
		for(int i =0; i <10; i ++){
			System.out.println(empoloyee[i].toString());
		}
	}
	
	 		
}
