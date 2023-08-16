package com.coderscampus;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FileService {
	
	public Student[] readFile(String file) {
		
		Student[] students = new Student[100]; // You need to determine the actual number of students
        
        try (BufferedReader fileReader = new BufferedReader(new FileReader(file))) {
            String line;
            int i = 0;
            fileReader.readLine();
            while ((line = fileReader.readLine()) != null) {
                String[] studentData = line.split(",");
                
              
                Integer id = Integer.parseInt(studentData[0]);
                String name = studentData[1];
                String course = studentData[2];
                Integer grade = Integer.parseInt(studentData[3]);
                    
                students[i] = new Student(id, name, course, grade);
                i++;
                
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return students;
	}
	
	public void sortByCourse (Student[] students) throws IOException {
		BufferedWriter writer1 = new BufferedWriter(new FileWriter("course1.csv"));
		BufferedWriter writer2 = new BufferedWriter(new FileWriter("course2.csv"));
		BufferedWriter writer3 = new BufferedWriter(new FileWriter("course3.csv"));
		
			
			try {
				writer1.write("ID,Name,Course,Grade\n");
				writer2.write("ID,Name,Course,Grade\n");
				writer3.write("ID,Name,Course,Grade\n");
				for (int i = 0; i < students.length; i++) {
					if (students[i].getCourse().matches("^[A][A-Z]+.[0-9]+")) {
						writer1.write(students[i].toString()); 
					} else if (students[i].getCourse().matches("^[C][A-Z]+.[0-9]+")) {
						writer2.write(students[i].toString());
					} else if (students[i].getCourse().matches("^[S][A-Z]+.[0-9]+")) {
						writer3.write(students[i].toString());
					}
				}
			} finally {		
				writer1.close();
				writer2.close();
				writer3.close();
				
				
				
			} 
		}	
	}
		
	
		
				


