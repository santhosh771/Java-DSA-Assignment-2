


import java.util.Scanner; // import the Scanner class 

public class Question_9 {
  public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		if(a!=0 && b!=0 && c!=0)
		{
			if(a==b && b==c)
			{
				System.out.println("equilateral");
			}
			else if(a!=b && b!=c && a!=c)
			{
				System.out.println("scalene");
			}
			else
			{
				System.out.println("isosceles");
			}
			}
		else
		{
			System.out.println("Invalid triangle");
		}
  }
		}


