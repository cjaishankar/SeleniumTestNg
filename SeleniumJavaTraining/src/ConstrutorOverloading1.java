
// We can use this scenario in our Automation testing E.g. There is a screen around 10 Fields, Based on the scenario you may use 5 or 10 fields.
// in that case u can use this constructor, same functionality with different parameters.

public class ConstrutorOverloading1 
{
	String empId;
	String empName;
	String empDept;
	int eage;
	double esal;
	static String Company="DXC";
	
	ConstrutorOverloading1(String name, String dept, int age)
	{		
		empName =name;
		empDept = dept;
		eage=age;				
	}
	
	ConstrutorOverloading1(String name, String dept, int age, double sal)
	{
		empName =name;
		empDept = dept;
		eage=age;
		esal=sal;
		
	}
	ConstrutorOverloading1(String id, String name, String dept, int age, double sal)
	{
		empId =id;
		empName =name;
		empDept = dept;
		eage=age;
		esal=sal;
				
	}
	void display() {
		System.out.println("Employee Name :" + empId);
		System.out.println("Employee Name :" + empName);
		System.out.println("Employee Dept :" + empDept);
		System.out.println("Employee age  :" + eage);
		System.out.println("Employee sal  :" + esal);
		System.out.println("Employee sal  :" + Company);
	}
		
	public static void main(String[] args) 
	{
		ConstrutorOverloading1 emp1= new ConstrutorOverloading1("jai","SAP",22);
		ConstrutorOverloading1 emp2= new ConstrutorOverloading1("jai","SAP",22,23400.89);
		ConstrutorOverloading1 emp3= new ConstrutorOverloading1("E1234","jai","SAP",22,23400.89);
		System.out.println("============ Outupt for Constructor1 ============");
		emp1.display();
		System.out.println("============ Outupt for Constructor2 ============");
		emp2.display();
		System.out.println("============ Outupt for Constructor3 ============");
		emp3.display();
	}
	

}
