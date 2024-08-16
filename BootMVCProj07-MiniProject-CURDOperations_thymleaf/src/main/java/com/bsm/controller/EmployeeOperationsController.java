package com.bsm.controller;
import java.util.Map;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.bsm.model.Empoyee;
import com.bsm.servic.IEmployeeMgmtService;
@Controller
@RequestMapping("/employee")
public class EmployeeOperationsController {
	@Autowired
	private IEmployeeMgmtService employeeMgmtService;

	@GetMapping("/")
	public String showHome() {
		return "Home";
	}
	@GetMapping("/emp_report")
	public String showEmployeeReport1(Map<String, Object> map) {
		System.out.println("EmployeeOperationsController.showEmployeeReport()");
		Iterable<Empoyee> allEmplpyee = employeeMgmtService.getAllEmplpyee();
		map.put("empsList", allEmplpyee);
		return "show_employee_report";
	}

//	@GetMapping("/emp_add")
//	public String showFormForsaveEmployee(@ModelAttribute("emp") Empoyee emp) {
//		return "regiser_employee";
//	}

//	@PostMapping("/emp_add")
//	public String saveEmployee(@ModelAttribute("emp") Empoyee emp, Map<String, Object> map) {
//		String msg = employeeMgmtService.registerEmployee(emp);
//		Iterable<Empoyee> allEmplpyee = employeeMgmtService.getAllEmplpyee();
//		map.put("resultMsg", msg);
//		map.put("empsList", allEmplpyee);
//		return "show_employee_report";
//	}
//
//	@PostMapping("/emp_add")
//	public String saveEmployee(@ModelAttribute("emp") Empoyee emp, RedirectAttributes map) {
//		System.out.println("EmployeeOperationsController.saveEmployee()");
//		String msg = employeeMgmtService.registerEmployee(emp);
//		map.addFlashAttribute("resultMsg", msg);
//		return "redirect:emp_report";
//	}
//
//	@GetMapping("/emp_edit")
//	public String showEditEmployeeFormPage(@RequestParam("no") int no, @ModelAttribute("emp") Empoyee emp) {
//		Empoyee emp1 = employeeMgmtService.getEmployeeByNo(no);
//		BeanUtils.copyProperties(emp1, emp);
//		return "update_employee";
//	}
//
//	@PostMapping("/emp_edit")
//	public String editEmployee(RedirectAttributes attrs, @ModelAttribute("emp") Empoyee emp) {
//		String msg = employeeMgmtService.updateEmployee(emp);
//		attrs.addFlashAttribute("resultMsg", msg);
//		return "redirect:emp_report";
//	}
//
//	@GetMapping("/emp_delete")
//	public String deleteEmployee(RedirectAttributes attrs, @RequestParam int no) {
//		String msg = employeeMgmtService.deleteEmployeeById(no);
//		attrs.addFlashAttribute("resultMsg", msg);
//		return "redirect:emp_report";
//	}

}
