package comparatorInterface;

import java.util.Comparator;

public class DescendingOrderComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return Integer.compare(o2.getId(),o1.getId());
	}

}
