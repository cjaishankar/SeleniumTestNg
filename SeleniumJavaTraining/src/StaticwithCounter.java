
// We can use this scenario in our Automation testing E.g. There is a screen around 10 Fields, Based on the scenario you may use 5 or 10 fields.
// in that case u can use this constructor, same functionality with different parameters.

public class StaticwithCounter 
{
	static int Counter=0;
	
	StaticwithCounter()
	{		
//		while (Counter < 5) {
			Counter++;	
//			System.out.println(Counter);
//		}		

			System.out.println("count is :" +Counter);
	
	}
		
	public static void main(String[] args) 
	{
		StaticwithCounter c= new StaticwithCounter();
		StaticwithCounter c1= new StaticwithCounter();
		StaticwithCounter c2= new StaticwithCounter();
//		c.display();
//		c1.display();
//		c2.display();
//				

	
	}	

}
