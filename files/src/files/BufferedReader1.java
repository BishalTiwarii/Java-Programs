package files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader1 {

	public static void main(String[] args) throws IOException {
		FileReader f1=new FileReader("buffer.txt");
		BufferedReader f2=new BufferedReader(f1);
		String str=f2.readLine();
		
	   while (str!=null) {
		   System.out.println(str);
		   str=f2.readLine();
		
	}
		
			}

}
