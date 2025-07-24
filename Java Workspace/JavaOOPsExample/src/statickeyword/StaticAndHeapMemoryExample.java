package statickeyword;
class Employee {
	int id;		// n number of copy base upon object. 
	static int clientId;	// only one copy of static memory created
							// clientId = 0;
	void dis() {
		System.out.println("id is "+id);
		System.out.println("client id "+clientId);
	}
}
public class StaticAndHeapMemoryExample {

	public static void main(String[] args) {
	Employee emp1  = new Employee(); // heap memory , id = 0;	
	Employee emp2 = new Employee(); // heap memory , id =0;
	emp1.id=100;
	emp2.id=200;
	Employee.clientId=111;
	emp1.clientId=222;
	emp2.clientId=333;
	emp1.dis();   // id = 100, clientId = 333
	emp2.dis();   // id = 200, clientId = 333
	}

}
