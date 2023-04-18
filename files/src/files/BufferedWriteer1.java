package files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriteer1 {

	public static void main(String[] args) throws IOException {
		FileWriter f1=new FileWriter("buffer.txt");
		BufferedWriter f2=new BufferedWriter(f1);
		f2.write("writing into buffer.txt file");
		f2.newLine();
		char[] ch= {'a','b','c','d','e'};
		
		f2.write(ch);
		f2.flush();
		f2.close();
		
		
		

	}

}
