package task11;

public abstract class Employee implements Constants {
private String _FIO;
private String _typeOfWorker;
private double _salary;
public double get_salary() {
	return _salary;
}
public void set_salary(double _salary) {
	this._salary = _salary;
}
abstract void calculationSalary();
	
	
	
}
