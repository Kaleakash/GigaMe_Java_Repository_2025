
public class ArrayRetrieveExample {

	public static void main(String[] args) {
	int num[]= {10,20,30,40,50,45,23,56,78,98,43,12,43,21,56};
	System.out.println("index position "+num[0]);
		System.out.println("Size of array "+num.length);	// 15
	System.out.println("retreive value using for loop");
	
	for(int i=0;i<num.length;i=i+2) {
		System.out.println("Value is "+num[i]);
	}
	
	System.out.println("Retrieve the elements from array using enhanced loop");
	for(int n:num) {
		System.out.println("Value is "+n);
	}
	
	float salaries[]=new float[10];
	float salary = 45000;
	System.out.println("Assign the 10 salary in salaries variables");
	for(int i=0;i<salaries.length;i++) {
		salaries[i]=salary;
		salary=salary+1000;
	}
	System.out.println("All salaries are");
	for(float sal:salaries) {
		System.out.println("Salary is "+sal);
	}
	}

}
