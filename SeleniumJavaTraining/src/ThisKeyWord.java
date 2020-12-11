
public class ThisKeyWord 
{
	int rollno;
	String name;
	float fee;
	ThisKeyWord(int rollno,String name, float fee)
	{
//=====================================================
//Without using this keyWord, in this method will get the value 0/Null
//		rollno=rollno;
//		name=name;
//		fee =fee;
//=====================================================
//Without using this keyWord ---> In this method will return value but use this below parameters
//		(int r,String n, float f)
//		rollno = r;
//		name = n;
//		fee = f;
//=====================================================
//With using this keyWord
		this.rollno=rollno;
		this.name=name;
		this.fee =fee;
		
	}

	void display() {System.out.println(rollno + " " +name + " "+ fee);}
//}
//class TestThis1{
	public static void main(String[] args) {
		ThisKeyWord s1=new ThisKeyWord(111,"ankit",5000f);  
		ThisKeyWord s2=new ThisKeyWord(112,"sumit",6000f);  
		s1.display();
		s2.display();
	}

}
