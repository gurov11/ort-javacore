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
		double salary = 20.8 * 8 * this.salaryForHor;
		this.set_salary(salary);

	}

}
