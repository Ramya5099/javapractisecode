package JALAAcademyIO;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;

import org.omg.CORBA.portable.InputStream;

public class ReadingUsingBufferReaderIO {

	public static void main(String[] args) {
		try {
            //file path passed as parameter to the FileInputStream constructor.

	FileReader fr= new FileReader("www.txt");
	BufferedReader br = new BufferedReader(fr);
	int i;
	while((i=br.read())!=-1) {
		System.out.println((char)i);
		fr.close();
		br.close();
	}
}
	catch(Exception e){
        e.printStackTrace();
		
	}
		//reading text using FileInputStream
		try {
			FileInputStream is= new FileInputStream("os.txt");
			int j;
			while((j=is.read())!=-1) {
				System.out.println((char)j);
is.close();

			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		}
	}


