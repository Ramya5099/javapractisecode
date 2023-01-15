package JavaBasics;

public class LoopsConcept {

	public static void main(String[] args) {
		//1. while loop:
		//dis advantage of while loop: IT will generate infinite loop if you dont give increment
		int i=1;
		while(i<=10)
		{
			i=i+1;// incremental/decremental
		}
		System.out.println(i);
		
		//
		while(true) {
			System.out.println(" Welcome to Taj Hotel");
			break;
		}
	//
		int p = 1;
		while( p<=10) {
			System.out.println(p);
			if(p==5) {
				System.out.println("Bye");
			break;
			}
			p++;
			//
			int k=10;
			while(k>=10)
			{
				System.out.println(k); //10 9 8....1
				k--;
			}
		}
		//J++ means j=j+1
	
			// 2. for loop
		// Print 1 to 10;
	
			for(int j=1;j<=10;j++)
			{
				System.out.println(j);
				
				}
			
			//k-- means k=k-1;
			for(int k=10;k>=10;k--)
			{
				System.out.println(k);
		}
			
			
		//
		//for loop with break;
				for (int e=1; e<=10;e++)
				{
					if(e%2==0) {
						System.out.println(e); //2 4 6 8 10
						break;
					}
				}
		for (int w=100; w>=1; w--)
	{
		if (w%2==0) {
			System.out.println(w);
			break;
		}
	w--;
	}
				
				//char
			
			for (char c='a'; c<='z'; c++)
			{
				System.out.println(c);
			}
	}

}
