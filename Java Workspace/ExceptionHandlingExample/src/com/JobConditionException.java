package com;

public class JobConditionException extends Exception{

	public JobConditionException() {
		// TODO Auto-generated constructor stub
		super();			// it call super class empty constructor by default 
	}
	JobConditionException(String msg){
		//super();			// by default present 
		super(msg);			// we are calling super class parameter constructor to set the message. 
	}
}
