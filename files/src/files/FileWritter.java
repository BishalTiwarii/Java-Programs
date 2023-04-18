package files;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritter {

	public static void main(String[] args) throws IOException {
	  FileWriter f1=new FileWriter("./a.txt",true);
	  f1.write("hello everyone");
	  f1.write("\n");
	  char[] ch= {'a','b','c','d'};
      f1.write(ch);
	  f1.write("\n");
	  f1.write(10);
	  f1.flush();
	  f1.close();
	  
	  
	  
	  
	  
	  

	}

}
