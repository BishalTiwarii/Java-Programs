package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.ArrayList;
import java.nio.file.Path;

public class FileWriteRunner {

	public static void main(String[] args) throws IOException {
		Path pathToWrite=Paths.get("./resources/write.txt");
		
		List<String> list=new ArrayList<>();
		
		list.add("America");
		list.add("Finland");
		list.add("UAE");
		list.add("India");
		
		Files.write(pathToWrite,list);
		

	}

}
