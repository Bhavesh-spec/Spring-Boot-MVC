package com.bsm.repo;
import org.springframework.data.repository.CrudRepository;
import com.bsm.model.Empoyee;
public interface IEmployeeRepo extends CrudRepository<Empoyee,Integer>{

}
