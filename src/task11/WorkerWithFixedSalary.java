package task11;

public class WorkerWithFixedSalary extends Employee {

	
	
	public WorkerWithFixedSalary(String fio) {
		super();
		this.set_FIO(fio);
		this.set_typeOfWorker(this.type2);
		this.calculationSalary();
	}

	@Override
	public void calculationSalary() {
		int salary = this.fixedSalary;
		this.set_salary(salary);
	}

	
}
