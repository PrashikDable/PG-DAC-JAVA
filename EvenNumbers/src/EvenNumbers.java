// 4)  write a program to show even number within range accepted from user 

import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Specific Range");
		int specificrange = sc.nextInt();
		int range = sc.nextInt();
		
		System.out.println("Even Numbers Are - ");
		for(int i=specificrange ; i<=range ;i++)
		{	
		if(i % 2 == 0 )
			System.out.println(i);
		}
	}

}
