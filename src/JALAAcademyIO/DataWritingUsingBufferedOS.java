package JALAAcademyIO;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class DataWritingUsingBufferedOS {

	public static void main(String[] args) {
String s="this method is using Buffered Output Stream";
try {
    FileOutputStream fos = new FileOutputStream("bos.txt");
    BufferedOutputStream bos = new BufferedOutputStream(fos);
    byte[] arr = s.getBytes();
bos.write(arr);
bos.close();
fos.close();
System.out.println("Data is written to the file.");

}
catch (Exception e) {
    e.printStackTrace();

}
// Using Buffered writer
String s1="This text is written using buffered writer";
try {
	FileWriter fw= new FileWriter("bw.txt");
	BufferedWriter bw= new BufferedWriter(fw);
	bw.write(s1);
	bw.close();
	fw.close();
	System.out.println("Data is written to the file.");

	
}
catch (Exception e) {
    e.printStackTrace();

}

//Using file writer
	
String s2="This text is written using File writer";
try {
	FileWriter fw= new FileWriter("bw.txt");
	
	fw.write(s1);
	
	fw.close();
	System.out.println("Data is written to the file.");

	
}
catch (Exception e) {
    e.printStackTrace();

	}

}
