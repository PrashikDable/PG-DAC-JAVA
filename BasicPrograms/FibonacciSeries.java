// 2)  write a program for fibonacci series to n number 

import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Range.");
		int range = sc.nextInt();
		int n1 = 0;
		int n2 = 1;
		int n3;
		System.out.print(n1+" "+n2);
		sc.close();
		for(int i=2 ; i<=range ; ++i)
		{
			n3 = n1+n2;
			System.out.print(" "+n3);
			
			n1 = n2;
			n2 = n3;
		}
	}

}
