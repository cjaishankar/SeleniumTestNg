
public class ClassesMulObject {
	
	final int x=50;
	int y=90;
	int z=x+y;
	
	public static void main(String[] args) {
		
		ClassesMulObject objCO= new ClassesMulObject();
		ClassesMulObject objCO1= new ClassesMulObject();
		ClassesMulObject objCO2= new ClassesMulObject();
		int a = objCO.x;
		int b = objCO.y=89;
		int c= 	objCO1.x;
		int sum = a+b+c;
		System.out.println(sum);
		System.out.println(objCO2.z);
				
	}

}
