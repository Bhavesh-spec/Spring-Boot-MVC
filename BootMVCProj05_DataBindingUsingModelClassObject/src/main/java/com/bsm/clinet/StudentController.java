package com.bsm.clinet;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bsm.model.Student;

@Controller
public class StudentController {
	@GetMapping("/")
	public String showHome() {
		return "welcome";
	}

	@GetMapping("/regis")
	public String showForm(@ModelAttribute("stud") Student st) {
		System.out.println("StudentController.showRegister()"+st);
		return "student_register";
	}

	@PostMapping("/register")
	public String showDetailsOfStudent(Map<String, Object> map, @ModelAttribute("stud") Student st) {
		String grade = null;
		if (st.getAvg() != null) {
		
		    if (st.getAvg() >= 75) {
		    	grade = "first class with Dist";
		    }
		    else if (st.getAvg() >= 65) {
		    	grade = "first class";
		    }
		    else if (st.getAvg() >= 50) {
		    	
		    	grade = "second class";
		    }
		    else if (st.getAvg() >= 35) {
		    	grade = "third class";
		    }
		    else {
		    	grade = "fail";
		    }
		} else {
		 
		    System.out.println("Average is not set.");
		}
		map.put("result", grade);
		return "show_details";
	}
}
