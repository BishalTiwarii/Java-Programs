package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReadRunner {

	public static void main(String[] args) throws IOException {
		Path fileToRead=Paths.get("./resources/file.txt");
		// List<String> lines= Files.readAllLines(fileToRead); //prints lie an array list
		// System.out.println(lines);
		
		Files.lines(fileToRead).forEach(System.out::println); //prints line by line
	

	}

}
