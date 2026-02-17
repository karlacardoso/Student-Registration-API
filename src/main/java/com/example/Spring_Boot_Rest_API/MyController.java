package com.example.Spring_Boot_Rest_API;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class MyController {
	
	@GetMapping("/")
	public ResponseEntity<?> test(){
		return ResponseEntity.status(HttpStatus.ACCEPTED).body("Tested OK");
	}
	
	@Autowired
	StudentService ss;
	
	@PostMapping("register")
	public ResponseEntity<?> registration(@RequestBody Student s){
		try {
			ss.registration(s);
			return ResponseEntity.status(HttpStatus.ACCEPTED).body("Registration Sucessfully Completed");
		}
		catch(Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Fail");
		}
	}

}
