package JALAAcademyExceptionHAndling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileNotfoundExceptionClass {

	public static void main(String[] args) throws IOException   {
//When we try to access that file, that is not available in the system.
	//When we try to access that file which is inaccessible, for example, if a file is available for read-only operation and try to modify it,
 
	//it can throw the error.
		try {
			
		
		FileReader f= new FileReader("/invalid/file/location");
		BufferedReader bf= new BufferedReader(f);
		System.out.println(f.read());
		f.close();
	}
catch( FileNotFoundException e) {
	System.out.println("File cound exception is coming....");
	e.printStackTrace();
}
	

}
}
