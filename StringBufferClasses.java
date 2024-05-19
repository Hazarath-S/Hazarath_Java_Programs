package methodsprograms;
public class StringBufferClasses 
{
	public static void main(String[] args) 
	{
		// Concating the Given text to Testing
		StringBuffer SB1 = new StringBuffer("Automation");
		SB1=SB1.append("Testing");
		System.out.println(SB1);
		
		// Reverse the Given String
		SB1.reverse();
		System.out.println(SB1);
		
		// Declaring the String Lenght
		SB1.length();
		System.out.println(SB1.length());
	
		// Declare the Char At Postion
		System.out.println(SB1.charAt(5));
		
		SB1.subSequence(1, 5);
		System.out.println(SB1);
	}

}
