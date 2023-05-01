import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		
		int no = sc.nextInt();
		int temp = no;
		int length=0;
		
		while(temp!=0)
		{
			length++;
			temp=temp/10;
		}
		int temp2=no;
		int multi,rem,res=0;
		
		while(temp2!=0)
		{
			rem=temp2%10;
			multi = 1;
			for(int i=1 ; i<=length ; i++)
			{
				multi = multi*rem;
			}
			res=res+multi;
			temp2=temp2/10;
		}
		if(no==res)
		{
			System.out.println(no+" is an Armstrong Number");
		}
		else
		{
			System.out.println(no+" is not an Armstrong Number");
		}
	}

}
