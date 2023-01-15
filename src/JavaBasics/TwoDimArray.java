stringpackage JavaBasics;

public class TwoDimArray {

	public static void main(String[] args, int row) {
		String x[][]=new String[2][4];
		System.out.println(x.length);// total no of rows =2
		System.out.println(x[0].length); //total no of cols=4
		//1st row
		x[0][0]="A";
		x[0][1]="V";
		x[0][2]= "C";	
		x[0][3]="B";
		
		
		x[1][0]="A1";
		x[1][1]="V1";
		x[1][2]= "C1";	
		x[1][3]="B1";
		
		
		
		
		System.out.println(x[1][2]);
		
		//Pirnt all the values of 2D array : use 2 for loops
		// row=0, col= 0 to 3
		// row =1, col = 0 to 3
		// row =2, col= 0 to 4
		
		for(int row1=0;row1< x.length;row1++);
		{
		for( int col=0;col<x[0].length;col++)
		{
			System.out.println(x[row][col]);
		}
	
		}
		}
}

