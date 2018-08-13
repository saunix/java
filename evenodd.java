import java.util.Scanner;
class evenodd
{
	public static void main( String[] args )
	{
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number");
		int x= input.nextInt();
		if( x%2==0)
			System.out.println("number is even");
		else 
			System.out.println("num is odd");
		
	}
}		 
