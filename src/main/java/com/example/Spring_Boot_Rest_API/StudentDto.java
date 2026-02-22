package com.example.Spring_Boot_Rest_API;

import java.util.List;
import java.util.stream.Collectors;

public class StudentDto {
	private String fullname;
	
	public StudentDto(Student student) {
		this.fullname = student.getFullname();
	}

	public String getFullname() {
		return fullname;
	}

	public static List<StudentDto> change(List<Student> s) {
		
		return s.stream().map(StudentDto::new).collect(Collectors.toList());
	}
	
	

}
