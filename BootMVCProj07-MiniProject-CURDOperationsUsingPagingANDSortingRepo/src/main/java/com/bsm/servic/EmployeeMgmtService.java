package com.bsm.servic;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import org.springframework.stereotype.Service;

import com.bsm.model.Empoyee;
import com.bsm.repo.IEmpRepo;
import com.bsm.repo.IEmployeeRepo;
@Service("empService")
public class EmployeeMgmtService implements IEmployeeMgmtService{
	@Autowired
	private IEmployeeRepo employeeRepo;
	@Autowired
	private IEmpRepo empRepo;
	@Override
	public Iterable<Empoyee> getAllEmplpyee() {
		return employeeRepo.findAll();
	}
	@Override
	public String registerEmployee(Empoyee emp) {
	    return "emp saved with id value "+employeeRepo.save(emp).getEmpno();
	}
	@Override
	public Empoyee getEmployeeByNo(int no) {
		// TODO Auto-generated method stub
		Empoyee emp = employeeRepo.findById(no).orElseThrow(()->new IllegalArgumentException());
		return emp;
	}
	@Override
	public String updateEmployee(Empoyee emp) {		
		return "Employee is Updated with having id value::"+employeeRepo.save(emp).getEmpno();
	}
	@Override
	public String deleteEmployeeById(int eno) {

		employeeRepo.deleteById(eno);
		return eno+"employee id Employee is deleted";
	}

	@Override
	public Page<Empoyee> getEmployeesReportDataByPage(org.springframework.data.domain.Pageable pageable) {
		// TODO Auto-generated method stub
		return empRepo.findAll(pageable);
	}
}
