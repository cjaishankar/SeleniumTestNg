
public class JavaMethods {
////===============================================================================
//// Method Block 1	
////	===============================================================================
//	static void Mymethod()
//	{
//		System.out.println("My Program executed by calling Main method");
//		
//		int i =0;		
//		while (i<=10) {
//			if (i==7) {
//				break;
////				continue;
//			}
//			
//			System.out.println(i);
//			i++;
//			
//		}
//	}
////===============================================================================
//	// Method Block 2	
////===============================================================================
//	static void Add(double d, float f) 
//	{
//		System.out.println("Add two numbers double & fload and print as int");
////			double d= 10.00;
////			float f= 25.8778f;
//			int sum = (int)(d+f);
//				System.out.println("The float and double addtion values is " +sum);
//	}
//	
////===============================================================================
//	// Method Block 3 : String argument passing
////===============================================================================
//	
//	static void Empnames(String Fname,String Lname) 
//	{
//				
//				
//				System.out.println("The first and last name is :" +Fname + Lname);
//	}
//===============================================================================
	// Method Block 3 : Return method passing argument 
//===============================================================================
	
//	static int Add(int x , int y) 
//	{
//		return x+y;
//			
//		
//				
//	}
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
	
	
//===============================================================================
	// Main Method clling	
//===============================================================================


	
	public static void main(String[] args) {

		PublicStaticMethod objmain= new PublicStaticMethod();	
		objmain.myStatic();
		objmain.myPublic();
		
		
//		Add(9,5,5.46f);
		System.out.println(Add(2345,345));
		System.out.println(Add(9,5,5.46f));
//		int sum = Add(8,9);
//		System.out.println(sum);
		//System.out.println(Add(2345,345));
//		Empnames("Jai","Shankar");
//		Empnames("Jai","Kumar");
//		Empnames("Jai","Krushna");
//		Empnames("Jai","Jagadesh");
//		System.out.println("==============Method 1================");
//		Mymethod();
//		System.out.println("==============Method 2================");
//		Add(5.00,7.987f);
	
	}

}
