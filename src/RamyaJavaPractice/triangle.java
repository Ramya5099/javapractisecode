package RamyaJavaPractice;

public class triangle {
public static void main(String[] args) {
	
int i,j;

for(i=0;i<=4;i++)
{
	for(j=0;j<=i;j++)
	{
		System.out.print("*");
		
	}
System.out.println("");
}



System.out.println("........");


// reverse triangle

for(int k=0;k<=4;k++) {
	for(int l=4;l>=k;l--)
	{		
		System.out.print("*");
	}
	System.out.println("");

}
// square
for(int m=0;m<=4;m++) {
	for (int n=0;n<=4;n++) {
		System.out.print("*");
	}
System.out.println("");
}
}
}