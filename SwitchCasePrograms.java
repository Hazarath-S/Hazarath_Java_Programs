package methodsprograms;
import java.util.Scanner;
public class SwitchCasePrograms
{
	public static void main(String[] args)
	{
		Scanner S1 = new Scanner(System.in);
		  System.out.println(S1.nextInt());
	  switch (0) 
		{
		
		case 1:
			System.out.println("This is First");
			
		case 2:
			System.out.println("This is Second");
			
		case 3: 
			System.out.println("This is third");
			
		case 4: 
			System.out.println("This is Fourth");
			
			default :
				System.out.println("Please enter Valid data");	
		}
	}
}
