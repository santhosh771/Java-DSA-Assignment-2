

import java.util.Scanner; // import the Scanner class 

public class Question_10 
{
  public static void main(String[] args) 
  		{
		Scanner sc  = new Scanner(System.in);
		long a = sc.nextLong();
			if(a%5==0 && a%11==0)
			{
				System.out.println("1");
			}
			else
			{
				System.out.println("0");
			}
		}

}


