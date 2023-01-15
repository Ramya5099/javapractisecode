package JALAAcademyArrays;

public class AverageofArray {
public static void avgarray(int[] arr) {
	int sum=0;
	for(int i: arr) {
		sum = sum+i;
	}
int average = sum/arr.length;
System.out.println("average of an array :" +average);
}
	public static void main(String[] args) {
int[] arr= {1,2,3,4,5};
avgarray(arr);
	}

}
