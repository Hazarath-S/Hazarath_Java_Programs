package AssignmentPrograms;
public class MethodOverridingpolymorphism 
{
	//New Concept of Polimorphism 
	public void Name() 
	{
		String Operant1 = "Hazarath@123";
		String Operant2 = "Automation Batch 41";
		//Printing the String Values
		System.out.println(" The New Concept of Polymorphism is : " +(Operant1+Operant2));	
	}
		void login() 
		{
			String Login= "GrotechMinds";
			System.out.println("GroTechMinds Login id is :"+(Login));
	    }	
		public class Child_one_method extends MethodOverridingpolymorphism
		{
			void login1() 
			{
				System.out.println("This");		
			}	
		}
	public static void main(String[] args) 
	{
		//Creating the ParentClass Object and Printing this parentClass.
		MethodOverridingpolymorphism M1= new MethodOverridingpolymorphism();
		M1.Name();
		M1.login(); 
	}
}
