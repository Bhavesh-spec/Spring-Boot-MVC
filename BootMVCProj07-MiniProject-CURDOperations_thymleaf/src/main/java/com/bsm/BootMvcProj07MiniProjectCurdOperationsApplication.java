package com.bsm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.bsm.model.Empoyee;
import com.bsm.servic.EmployeeMgmtService;

@SpringBootApplication
public class BootMvcProj07MiniProjectCurdOperationsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(BootMvcProj07MiniProjectCurdOperationsApplication.class, args);
//		EmployeeMgmtService bean = run.getBean("empService",EmployeeMgmtService.class);
//		Iterable<Empoyee> allEmplpyee = bean.getAllEmplpyee();
//		allEmplpyee.forEach(a->System.out.println(a));
	}
}
