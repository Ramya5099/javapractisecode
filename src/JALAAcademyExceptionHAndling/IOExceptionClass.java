package JALAAcademyExceptionHAndling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class IOExceptionClass {
//if there is any issues with input/output file operations issues IO will be throwned
	public static void main(String[] args) {
File file = new File("input.txt");
FileInputStream fis= null;
try {
	fis=new FileInputStream(file);
	fis.read();
	fis.close();
}
catch (IOException e) {
    System.out.println("IOE is coming..");
    e.printStackTrace();
}
	}

}
