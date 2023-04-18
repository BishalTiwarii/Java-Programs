package files;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriter1 {

	public static void main(String[] args) throws IOException {
		File f1=new File("printWriter");
		f1.createNewFile();
		
		PrintWriter f2=new PrintWriter(f1);
		char[] ch= {'A','B','C','D'};
		
		int a=10;               
		boolean b=false;
		byte  c=10;
		long l=300000;
		
		String str="Informatics practices";
		
		f2.println(b);
	    f2.println(l);
		f2.println(c);
		f2.println(str);
		f2.println(c);
		f2.println(ch);
		
		f2.flush();
		f2.close();
		
		
		

	}

}
