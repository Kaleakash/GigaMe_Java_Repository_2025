import java.util.Scanner;

public class EmployeeDetails {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the id");
	int id = sc.nextInt();
	System.out.println("Enter the name");
	String name = sc.next();
	System.out.println("Enter the salary");
	float salary = sc.nextFloat();
	System.out.println("Enter the result (true/false)");
	boolean result = sc.nextBoolean();
	
	System.out.println("id is "+id);
	System.out.println("name is "+name);
	System.out.println("salary is "+salary);
	System.out.println("Result is "+result);
	}

}
