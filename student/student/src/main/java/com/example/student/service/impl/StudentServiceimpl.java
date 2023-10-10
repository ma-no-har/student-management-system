package com.example.student.service.impl;

import java.util.List;


import org.springframework.stereotype.Service;
import com.example.student.entity.Students;
import com.example.student.repository.StudentRepository;
import com.example.student.service1.StudentService;

@Service
public class StudentServiceimpl implements StudentService{
	private StudentRepository studentRepository;
	public StudentServiceimpl(StudentRepository studentRepository)
	{
		super();
		this.studentRepository = studentRepository;
	}

	public List<Students> getAllStudent() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public Students saveStudent(Students student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	@Override
	public Students getStudentById(String first_Name) {
		// TODO Auto-generated method stub
		return studentRepository.findById(first_Name).get();
	}

	@Override
	public Students updateStudent(Students student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

}
