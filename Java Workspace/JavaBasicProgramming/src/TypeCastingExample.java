
public class TypeCastingExample {

	public static void main(String[] args) {
		byte a=10;
		short b =a;	// implicit type casting 
		System.out.println("a "+a);
		System.out.println("b "+b);

		short c=10;
		byte d = (byte)c;		// explicit type casting 
		System.out.println("c "+c);
		System.out.println("d "+d);
		
		int i=100;
		float j=i;	// implicit type casting 
		System.out.println("i "+i);
		System.out.println("j "+j);
		
		//float k = 100;
		//float k = (float)100.12;	// explicit type casting
		//double k = 100.12;
		float k = 100.12f;
		int l = (int)k;		// explicit type casting 
		System.out.println(" k "+k);
		System.out.println("l "+l);
		
	}

}
