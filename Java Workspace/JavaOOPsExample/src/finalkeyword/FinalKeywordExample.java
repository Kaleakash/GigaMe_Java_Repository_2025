package finalkeyword;

final class Abc {
	final void dis1() {
		System.out.println("Abc class method");
	}
}
//class Mno extends Abc{
////	void dis1() {
////		System.out.println("Mno class method override Abc class method");
////	}
//}
public class FinalKeywordExample {
	public static void main(String[] args) {
	final int A=100;
	System.out.println(A);
	//A=200;
//	Mno obj = new Mno();
//	obj.dis1();
	Abc obj = new Abc();
	obj.dis1();
	}

}
