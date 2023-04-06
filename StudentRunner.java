package bishal;

public class StudentRunner {

	public static void main(String[] args) {
		int marks[]=new int[2];
		marks[0]=100;
		marks[1]=80;
		String name[]=new String[2];
		name[0]="Bishal";
		name[1]="Neel";
		Student number=new Student(name,marks);
		System.out.println(number.getMaximumMarks());
        System.out.println(number.getMinimumMarks());
        System.out.println(number.getNumberOfMarks());
        System.out.println(number.getAverageOfMarks());
	}

}
