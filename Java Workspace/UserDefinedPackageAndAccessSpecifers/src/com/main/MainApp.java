package com.main;
import com.college.Attendance;
import com.college.Subject;
//import com.school.Attendance;
//import com.college.*;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Attendance att1 = new Attendance();
		att1.display();
		com.school.Attendance  att2= new com.school.Attendance();
		att2.display();
		Subject ss = new Subject();
		ss.displaySubjectDetails();
	}

}
