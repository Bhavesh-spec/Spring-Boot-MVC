package com.bsm.repo;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.bsm.model.Empoyee;

public interface IEmpRepo extends PagingAndSortingRepository<Empoyee,Integer>{

	

}
