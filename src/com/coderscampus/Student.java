package com.coderscampus;

import java.io.Serializable;

public class Student implements Comparable<Student>, Serializable {
	private static final long SerialVersionUID = 1L;
	private Integer id;
	private String name;
	private String course;
	private Integer grade;
	
	public Student() {
		
	}
	
	public Student (Integer id, String name, String course, Integer grade) {
		this.id = id;
		this.name = name;
		this.course = course;
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return this.id + "," + this.name + "," + this.course + "," + this.grade + "\n";
	}
	

	public Integer getId() {
		return id;
	}





	public void setId(Integer id) {
		this.id = id;
	}





	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public String getCourse() {
		return course;
	}





	public void setCourse(String course) {
		this.course = course;
	}





	public Integer getGrade() {
		return grade;
	}





	public void setGrade(Integer grade) {
		this.grade = grade;
	}





	@Override
	public int compareTo(Student that) {
		return that.grade.compareTo(this.grade);
	}
	

}
