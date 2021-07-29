package com.example.demo;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class StudentResources {
	
	@RequestMapping("students")
	List<Students> getStudentDetails(){
		
		// added student Details here 
		List<Students> listStds = new ArrayList<Students>();
		Students student1=new Students();
		student1.setName("ram");
		student1.setStudentId(16);
		student1.setDivision("division B");
		student1.setAddress(" nanded city");
		
		Students student2=new Students();
		student2.setName("raghav");
		student2.setStudentId(16);
		student2.setDivision("division A  ");
		student2.setAddress("pune city");
		
		listStds.add(student1);
		listStds.add(student2);
		return listStds;
		
	}

	

}