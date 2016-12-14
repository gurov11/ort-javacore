package task11;

public class WorkerWithSalaryPerHour extends Employee {

	@Override
	void calculationSalary() {
		double salary = 20.8*8*this.salaryForHor;
		this.set_salary(salary);
		
	}

}
