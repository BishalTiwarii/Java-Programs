package comparatorInterface;
import java.util.ArrayList;
import java.util.Collections;

public class EmployeeCollectionRunner {

	public static void  main(String[] args) {
		Employee emp1=new Employee(101,"Jack");
		Employee emp2=new Employee(102,"John");
		Employee emp3=new Employee(103,"Martin");
		
		ArrayList<Employee> employees=new ArrayList<>();
		employees.add(0, emp1);	
		employees.add(1, emp2);
		employees.add(2, emp3);
		System.out.println(employees);
		
		ArrayList<Employee> arr=new ArrayList<>(employees);
		
		Collections.sort(arr,new AescendingOrderComparator());	
		System.out.println("Aescending order = "+arr);
		
		Collections.sort(arr,new DescendingOrderComparator());
		System.out.println("Descending order = "+arr);
			  	  
	  
	  
		

	}

}
