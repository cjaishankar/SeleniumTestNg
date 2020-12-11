
// We can use this scenario in our Automation testing E.g. There is a screen around 10 Fields, Based on the scenario you may use 5 or 10 fields.
// in that case u can use this constructor, same functionality with different parameters.

public class StaticwithoutCounter 
{
	 int Counter=0;
	
	StaticwithoutCounter()
	{		
//		while (Counter < 5) {
			Counter++;	
			System.out.println(Counter);
		}
		
	
//	}
		
	public static void main(String[] args) 
	{
		StaticwithoutCounter c= new StaticwithoutCounter();
		StaticwithoutCounter c1= new StaticwithoutCounter();
		StaticwithoutCounter c2= new StaticwithoutCounter();
//		c.display();
//		c1.display();
//		c2.display();
//				

	
	}	

}
