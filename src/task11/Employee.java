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

	public String get_FIO() {
		return _FIO;
	}

	public void set_FIO(String _FIO) {
		this._FIO = _FIO;
	}

	public String get_typeOfWorker() {
		return _typeOfWorker;
	}

	public void set_typeOfWorker(String _typeOfWorker) {
		this._typeOfWorker = _typeOfWorker;
	}

}
