package task11;

public class WorkerWithFixedSalary extends Employee {

	@Override
	public void calculationSalary() {
		double salary = this.fixedSalary;
		this.set_salary(salary);
	}

	
}
