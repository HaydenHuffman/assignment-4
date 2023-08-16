package com.coderscampus;

import java.io.IOException;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		Student[] students = new Student[100];
		FileService fileService = new FileService();
		students = fileService.readFile("./student-master-list.csv");
		Arrays.sort(students);
		fileService.sortByCourse(students);	
	}

}
