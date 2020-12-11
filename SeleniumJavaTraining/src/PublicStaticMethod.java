public class PublicStaticMethod {
	
	static void myStatic() {
		System.out.println("this static method, we can called directly without creating any object");
	}
	public void myPublic() {
		System.out.println("this Public method, we can't called directly without creating any object");
		
	}
	
	public static void main(String[] args) {
		myStatic();
		PublicStaticMethod myPubobj= new PublicStaticMethod();
		myPubobj.myPublic();
	
	}

}
