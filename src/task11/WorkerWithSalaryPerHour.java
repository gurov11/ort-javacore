package task11;

public class WorkerWithSalaryPerHour extends Employee {

	public WorkerWithSalaryPerHour(String fio) {
		super();
		this.set_FIO(fio);
		this.set_typeOfWorker(this.type1);
		this.calculationSalary();
	}

	@Override
	void calculationSalary() {
		int salary = (int) 20.8 * 8 * this.salaryForHor;
		this.set_salary(salary);

	}

}
