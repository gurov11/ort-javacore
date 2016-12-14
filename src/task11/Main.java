package task11;

public class Main {

	public static void main(String[] args) {
		Employee[] empoloyee = new  Employee[10];
		empoloyee[0] = new WorkerWithSalaryPerHour(Constants.FIO);
		empoloyee[0] = new WorkerWithFixedSalary(Constants.FIO2);
		empoloyee[0] = new WorkerWithSalaryPerHour(Constants.FIO3);
		empoloyee[0] = new WorkerWithFixedSalary(Constants.FIO4);
		empoloyee[0] = new WorkerWithFixedSalary(Constants.FIO5);
		empoloyee[0] = new WorkerWithSalaryPerHour(Constants.FIO6);
		empoloyee[0] = new WorkerWithFixedSalary(Constants.FIO7);
		empoloyee[0] = new WorkerWithSalaryPerHour(Constants.FIO8);
		empoloyee[0] = new WorkerWithFixedSalary(Constants.FIO9);
		empoloyee[0] = new WorkerWithFixedSalary(Constants.FIO10);

	}

}
