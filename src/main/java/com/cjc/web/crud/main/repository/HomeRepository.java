package com.cjc.web.crud.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.web.crud.main.model.Student;

@Repository
public interface HomeRepository extends CrudRepository<Student, Integer>{
	
	public Student findAllBysId(int sId);

}
