package task11;



import java.util.Comparator;

public class CompSalaryAndFio implements Comparator<Employee> {
	public int compare(Employee o1, Employee o2) {

		double flag = o1.get_salary() - o2.get_salary();

		if (flag == 0)
			flag = o1.get_FIO().compareTo(o2.get_FIO());
		return (int) flag;
	}
}

