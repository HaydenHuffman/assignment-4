package com.coderscampus;

public class StudentService {
	public String[] parseText(String input) {
		String[] output = input.split(",");
//		System.out.println(output);
		return output;
	}
	
	public Student createStudent(Student[] input) {
		Student student = new Student();
		student.setId(input[0].getId());
		student.setName(input[1].getName());
		student.setCourse(input[2].getCourse());
		student.setGrade(input[3].getGrade());
		return student;
	}

}
