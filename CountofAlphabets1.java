package AssignmentPrograms;
import java.util.Arrays;
public class CountofAlphabets1 
{
	static int CountofAlphabets1 = 0;
	public static void main(String[] args) 
	{
		String Name ="Hazarath";
		char[] C1 = Name.toCharArray();
		System.out.println(Arrays.toString(C1));	
		for(int i = 0;i<C1.length;i++)
		{
	boolean Price  = Character.isAlphabetic(C1[i]);
	 if(Price==true) 
	 {
		 CountofAlphabets1++;
	 }	
		}
		System.out.println("The String Arrays is :"+CountofAlphabets1);
	}
}
