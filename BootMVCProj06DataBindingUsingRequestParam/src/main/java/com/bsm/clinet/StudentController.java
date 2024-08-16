package com.bsm.clinet;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class StudentController {
//	@GetMapping("/regis")
//	public String showForm(@RequestParam("sno") int no,@RequestParam("sname") String name) {
//		System.out.println(no+" "+name);
//		return "student_register";
//	}
	
//	@GetMapping("/regis")
//	public String showForm(@RequestParam int sno,@RequestParam String sname) {
//		System.out.println(sno+" "+sname);
//		return "student_register";
//	}

//	@GetMapping("/regis")
//	public String showForm(@RequestParam int sno,@RequestParam(required = false) String sname) {
//		System.out.println(sno+" "+sname);
//		return "student_register";
//	}
	
//	@GetMapping("/regis")
//	public String showForm(@RequestParam int sno,@RequestParam(defaultValue = "rrr") String sname) {
//		System.out.println(sno+" "+sname);
//		return "student_register";
//	}
	
//	@GetMapping("/regis")
//	public String showForm(@RequestParam(name="sno",defaultValue = "2001") int no,
//			               @RequestParam("sname")String name) {
//		System.out.println(no+" "+name);
//		return "student_register";
//	}
	
//	@GetMapping("/regis")
//	public String showForm(@RequestParam(name="sno",required = false) Integer no,
//			               @RequestParam("sname")String name) {
//		System.out.println(no+" "+name);
//		return "student_register";
//	}
	
	@GetMapping("/regis")
	public String showForm(@RequestParam(name="sno",required = false) Integer no,
			               @RequestParam("sname")String name,
			               @RequestParam("sadd")String addrs[],
			               @RequestParam("sadd")List<String> saddList,
			               @RequestParam("sadd")Set<String> saddSet
			               ) {
		System.out.println(no+" "+name+" "+Arrays.toString(addrs)+" "+saddList+" "+saddSet);
		return "student_register";
	}
}
