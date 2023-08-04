package com.cjc.web.crud.main.servicei;

import com.cjc.web.crud.main.model.Student;

public interface HomeServiceI {
  
     public void saveData(Student s);
     
     public Iterable<Student> displayAllData();
     
     public void deleteData(Student s);
     
     public Student getSingleData(int sId);
}
