package com.example.Spring_Boot_Rest_API;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class StudentService {
	@Autowired
	StudentRepo sr;
	
	public void registration( Student s) {
		sr.save(s);
	}
	
	public List<Student> getallstudents(){
		return sr.findAll();
	}

}
