

import java.util.Scanner; // import the Scanner class 

public class Question_11
{
  public static void main(String[] args) 
  		{
		Scanner sc  = new Scanner(System.in);
		long n = sc.nextLong();
		int b = sc.nextInt();
		long a = sc.nextLong();
		if(b==1)
		{
		System.out.println(n+a)	;
		}
		else if(b==2)
		{
			if(n-a>=0) 
			{
				System.out.println(n-a)	;
			}
			else
			{
				System.out.println("Insufficient Funds")	;
			}
		}

}
}


