package files;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		
		try {
			File newFile=new File("javaDemo.txt");
			if (newFile.createNewFile()) {
				System.out.println("file created Successfully");
			
				
			}
			else {
				System.out.println("file already exists");
				System.out.println(newFile.getPath());
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
