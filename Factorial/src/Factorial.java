import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Number.");
		int no = sc.nextInt();
		int res = no;
		
		for(int i=no-1 ; i>=1 ; i--)
		{
			no = res*i;
			res = no;
		}
		System.out.println("Factorial = "+res);
	}
}