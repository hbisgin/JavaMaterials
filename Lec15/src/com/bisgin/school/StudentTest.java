package com.bisgin.school;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		GraduateStudent gStudent = new GraduateStudent();
		System.out.println(student.getName());
		gStudent.setProgram("CS");
		System.out.println(gStudent.getName() + " studying " + gStudent.getProgram());

	}

}
