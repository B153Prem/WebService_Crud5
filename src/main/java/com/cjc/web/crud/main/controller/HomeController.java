package com.cjc.web.crud.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.web.crud.main.model.Student;
import com.cjc.web.crud.main.serviceimpl.HomeServiceImpl;

@RestController
public class HomeController {
	
	     @Autowired 
	     HomeServiceImpl hsi;
	     
	     @PostMapping("/saveData")
	     public String saveData(@RequestBody Student s)
	     {
	    	 hsi.saveData(s);
	    	 return "Save Data Successfully";
	     }
	     
	     @GetMapping("/getAlldata")
	     public Iterable<Student>getAllData()
	     {
	    	 Iterable<Student>slist=hsi.displayAllData();
	    	 return slist;
	     }
	     
	     @PutMapping("/updateData/{sId}")
	     public String updateData(@PathVariable("sId")int sId,@RequestBody Student s)
	     {
	    	 hsi.saveData(s);
	    	 return "Upadate Data Successfully";
	     }
	     
	     @DeleteMapping("/deleteData/{sId}")
	     public String deleteData(@PathVariable("sId")int sId,@RequestBody Student s)
	     {
	    	 hsi.deleteData(s);
	    	 return "Delete Data Successfully";
	     }
	     
	     @GetMapping("/getSingleData/{sId}")
	     public Student getSingleData(@PathVariable("sId")int sId)
	     {
	    	 Student s=hsi.getSingleData(sId);
	    	 return s;
	     }

}
