package tryWithResources;

import java.io.FileOutputStream;

public class TryWithResources {

	public static void main(String[] args) {
		try(FileOutputStream file=new FileOutputStream("./trywithresources.txt"))
		{
			String str="try with resources program";
			byte [] byteArray=str.getBytes();
		    file.write(byteArray);
		    System.out.println("file Written successfully");
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
