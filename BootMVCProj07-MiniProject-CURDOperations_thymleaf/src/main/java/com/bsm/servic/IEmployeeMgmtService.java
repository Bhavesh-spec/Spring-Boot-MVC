package com.bsm.servic;

import com.bsm.model.Empoyee;

public interface IEmployeeMgmtService {
public Iterable<Empoyee> getAllEmplpyee();
public String registerEmployee(Empoyee emp);
public Empoyee getEmployeeByNo(int no);
public String updateEmployee(Empoyee emp);
public String deleteEmployeeById(int eno);
}
