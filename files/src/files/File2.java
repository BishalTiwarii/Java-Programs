package files;
import java.io.File;

public class File2 {

	public static void main(String[] args) {
		File f1=new File("./resources");
		String[] list=f1.list();
		
		for(String list1:list)
		{
		   System.out.println(list1);	
		}

		
		File f2=new File(".");
		
		String[] list2=f2.list();
		
		for(String list3:list2)
		{
			File f3=new File(f2, list3);
			if (f3.isFile()) {
				System.out.println(list3);
				
			}
			
		}
		
	}

}
