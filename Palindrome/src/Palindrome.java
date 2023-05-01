import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter The Number: ");
		int no=sc.nextInt();
		int temp = no;
		int rem , rev=0;
		
		while(temp!=0)
		{
			rem= temp%10;
			rev = rev*10+rem;
			temp=temp/10;
		}
		if(no==rev)
			System.out.println(no+" is a Palindrome Number.");
		else
			System.out.println(no+" is not a Palindrome Number.");
	}

}
