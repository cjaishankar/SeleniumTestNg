
public class JConstructorParameter {
	
	 int  x;
	 int modelYear;
	 String modelName;
	public JConstructorParameter(int year, String name) {
	    modelYear = year;
	    modelName = name;
	  }
	public JConstructorParameter(int y,int b) {
		x=y+b;
		//System.out.println(y+x);
	}
//	public JConstructor(String d, String e) {
//		
//		System.out.println(d+" "+e);
//	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		JConstructor objcon= new JConstructor(12,88);
//		JConstructor objcon1= new JConstructor("jai","Shankar");
//		System.out.println(objcon.x);
		JConstructorParameter objcon2= new JConstructorParameter(1999,"Maruthi 800");
		System.out.println("Car module year is :"+objcon2.modelName + " "+ "Car name is :" +objcon2.modelYear);
		
	}

}
