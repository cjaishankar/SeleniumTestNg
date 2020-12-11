
public class Constructor1Default 
{
	int id;
	String name;	

	void display() 
	{
		System.out.println(id + " " + name);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor1Default obj1 = new Constructor1Default();
		Constructor1Default obj2 = new Constructor1Default();
		obj1.display();
		obj2.display();
		
		
		}

}

