package com.example.student;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import com.example.student.entity.Students;
//import com.example.student.entity.Students;
import com.example.student.repository.StudentRepository;

@SpringBootApplication
public class StudentApplication  implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentApplication.class, args);
	}
	@Autowired
	StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
//		Students student1 = new Students("Manohar","surepally","manohar.surepally@gmail.com");
//		studentRepository.save(student1);
//		
//		Students student2 = new Students("Chakri","some...","chakri@gamil.com");
//		studentRepository.save(student2);
//	Students student = new Students("Vasu","Jala","Vasu@gmail.com");
//		studentRepository.save(student);
		
			
	}

}
