package arrayList;
import java.util.ArrayList;

public class ArrayListex {

	public static void main(String[] args) {
	ArrayList a1= new ArrayList(); //Heterogeneous array list creation
	a1.add("Maruti"); //adding string values
	a1.add("kia");
	a1.add(100);  //adding number values
	
	System.out.println(a1); //printing arrayList values
	
	a1.remove(0); //removing values from the array with the help of index number
	System.out.println(a1); //again printing
	
	a1.remove("kia"); //removing the values from the arrayList by Passing values.
	System.out.println(a1);
	
	
	ArrayList<String> a2=new ArrayList<String>(); //generic arrayList creation.
		
	a2.add("MSD");
	a2.add("virat kohli");
	a2.add("Dinesh karthik");
	
	System.out.println(a2); //accessing the values in the arrays.
	

	}

}
