
public class Constructor2_Parameter 
{
	int id;
	String name;	
	
	
	Constructor2_Parameter(int i, String n)
	{
				
		id= i;
		name = n;
	
		
	}
	void display() 
	{
		System.out.println(id);
		System.out.println(name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor2_Parameter obj1 = new Constructor2_Parameter(111, "jai");
		Constructor2_Parameter obj2 = new Constructor2_Parameter(112, "shankar");
		obj1.display();
		obj2.display();
		
		
		}

}

