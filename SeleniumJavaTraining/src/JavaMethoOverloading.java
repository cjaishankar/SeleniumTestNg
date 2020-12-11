
public class JavaMethoOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Add(2345,345));
		System.out.println(Add(9,5,5.46f));

	}
	//===============================================================================
	// Method Block 3 : String argument passing
//===============================================================================
	
	static int Add(int x , int y) 
	{
		return x+y;
			
		
				
	}
	static int Add(int x , int y, float f) 
	{
		int i=(int)f;
		return x+y+i;
	}

}
