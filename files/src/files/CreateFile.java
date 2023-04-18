package files;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.ArrayList;

public class CreateFile {

	public static void main(String[] args) throws IOException {
		File file=new File("file.txt");
		System.out.println(file.exists());
		file.createNewFile();
		System.out.println(file.exists());

		File f1=new File("java");
		System.out.println(f1.exists());
		f1.mkdir();
		System.out.println(f1.exists());
		
		File f2=new File("java","java.txt");
		System.out.println(f2.exists());
		f2.createNewFile();
		
		System.out.println(f2.length());
		
		Path path=Paths.get("./java/java.txt");
		
		List<String> data=new ArrayList<>();
		data.add("java");
		data.add("document");
		data.add("file");
		
		Files.write(path,data);
		
		System.out.println(Files.readAllLines(path));
		
		Files.lines(path).forEach(System.out::println);
		System.out.println(file.delete());
		
		
	}

}
