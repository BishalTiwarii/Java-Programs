package inheritance;

public class StudentInheritance extends Person {
	private String collegeName;

	public StudentInheritance(String name, String address, String bloodGroup, int mobNo) {
		super(name, address, bloodGroup, mobNo);
		
	}
	public static void main(String[] args)
	{
		StudentInheritance student=new StudentInheritance("Bishal", "A+", "Bangalore", 7987333);
		 System.out.println(student);
		  student.setCollegeName("Cats"); 
		  System.out.println(student);

	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
    }

