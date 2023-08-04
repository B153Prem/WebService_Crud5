package com.cjc.web.crud.main.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.web.crud.main.model.Student;
import com.cjc.web.crud.main.repository.HomeRepository;
import com.cjc.web.crud.main.servicei.HomeServiceI;

@Service
public class HomeServiceImpl implements HomeServiceI {
	
	      @Autowired
	      HomeRepository hr;

		@Override
		public void saveData(Student s)
		{
	       hr.save(s);
			
		}

		@Override
		public Iterable<Student> displayAllData() 
		{
			
			return hr.findAll();
		}

		@Override
		public void deleteData(Student s)
		{
	      hr.delete(s);
			
		}

		@Override
		public Student getSingleData(int sId) 
		{
			
			return hr.findAllBysId(sId);
		}





		




}
