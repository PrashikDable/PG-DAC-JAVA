
//12) Calculate area of rectangle
import java.util.Scanner;
public class AreaOfRectangle {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length and Weidth");
		int length = sc.nextInt();
		int weidth = sc.nextInt();
		int Area = length*weidth;
		
		System.out.println("Area = "+Area);
	}

}
