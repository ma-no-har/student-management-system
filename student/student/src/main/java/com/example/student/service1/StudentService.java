package com.example.student.service1;

import java.util.List;

//import com.example.jpademo1.Model.Student;
//import com.example.jpademo1.Model.Student;
import com.example.student.entity.Students;

public interface StudentService {
	List<Students> getAllStudent();
	
	Students saveStudent(Students student);
	Students getStudentById(String first_Name);
	Students updateStudent(Students student);

}
