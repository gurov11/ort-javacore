package zzz2;

import java.util.Comparator;

public class CompByNumOfGroupAndSurname implements Comparator<Students> {
	public int compare(Students o1, Students o2) {

		int flag = o1.numberOfGroup() - o2.numberOfGroup();

		if (flag == 0)
			flag = o1.getSurname().compareTo(o2.getSurname());
		return flag;
	}
}
