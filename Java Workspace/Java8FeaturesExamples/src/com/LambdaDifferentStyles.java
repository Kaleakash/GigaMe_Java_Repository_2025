package com;
@FunctionalInterface
interface Operation {
	public int add(int x, int y);
}
public class LambdaDifferentStyles {

	public static void main(String[] args) {
	Operation op1 = (x,y)->x+y;
	System.out.println(op1.add(100, 200));
	Operation op2 = (int x, int y)->x+y;
	System.out.println(op2.add(10, 20));
	Operation op3 = (a,b)->a+b;
	System.out.println(op3.add(1, 2));
	Operation op4 = (a,b)-> {
		int sum = a+b;
		return sum;
	};
	System.out.println(op4.add(1000, 2000));
	}

}
