package com;

import java.util.Arrays;

public class StreamAPIWithArray {

	public static void main(String[] args) {
	int num[]= {1,2,3,4,5,6,7,8,9,10};
	// convert this array to stream and use intermediate or terminal operator 
	
	// display array element using stream api 
	//Arrays.stream(num).forEach(e->System.out.println(e));
	
	// display only even numbers 
	//Arrays.stream(num).filter(p->p%2==0).forEach(e->System.out.println(e));
	
	// display only odd numbers 
	//Arrays.stream(num).filter(p->p%2!=0).forEach(e->System.out.println(e));
	
	// display those number > 5;
	 //Arrays.stream(num).filter(p->p>5).forEach(e->System.out.println(e));
	
	// for each element do some modification ie add or remove  or sub or multiply 
	//Arrays.stream(num).map(f->f+1).forEach(v->System.out.println(v));
	
	// terminal operator anyMatch or allMatch 
	boolean result1 = Arrays.stream(num).anyMatch(p->p>9);
	System.out.println(result1);
	boolean result2 = Arrays.stream(num).allMatch(p->p>0);
	System.out.println(result2);
	boolean result3 = Arrays.stream(num).noneMatch(p->p>9);
	System.out.println(result3);
	}

}
