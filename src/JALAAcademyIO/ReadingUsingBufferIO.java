package JALAAcademyIO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class ReadingUsingBufferIO {

	public static void main(String[] args) {
try {
	            //file path passed as parameter to the FileInputStream constructor.

		FileInputStream fis= new FileInputStream("www.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		int i;
		while((i=bis.read())!=-1) {
			System.out.println((char)i);
			fis.close();
			bis.close();
		}
}
		catch(Exception e){
			e.getStackTrace();
			
		}
			
		
	}

}
