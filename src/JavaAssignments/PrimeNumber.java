package JavaAssignments;

public class PrimeNumber {
public void CheckPrimenumber(int num)
{
	int count=0;
	for(int i=1;i<=num;i++)
	{
		if(num%i==0) {
			count++;
		}
	}
if(count==2) {
	System.out.println("given number is prime");
}
else {
	System.out.println("given number is not prime");

}
}
	public static void main(String[] args) {
PrimeNumber pn= new PrimeNumber();
pn.CheckPrimenumber(14);
	}

}
