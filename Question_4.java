

import java.util.Scanner; // import the Scanner class 

public class Question_4 {
  public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
			if(a>b && a>c)
			{
				System.out.println(a);
			}
			else if(b>c)
			{
				System.out.println(b);
			}
			else
			{
				System.out.println(c);
			}
			}
		}


