package com.bsm.servic;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.bsm.model.Empoyee;

public interface IEmployeeMgmtService {
public Iterable<Empoyee> getAllEmplpyee();
public String registerEmployee(Empoyee emp);
public Empoyee getEmployeeByNo(int no);
public String updateEmployee(Empoyee emp);
public String deleteEmployeeById(int no);
public Page<Empoyee> getEmployeesReportDataByPage(Pageable pageable);

}
