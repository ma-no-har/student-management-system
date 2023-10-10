package com.example.student.controller;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.student.entity.Students;
import com.example.student.service1.StudentService;
import com.example.jpademo1.Model.Student;

@Controller
public class StudentController {
	private StudentService studentService;
	
	public StudentController(StudentService studentService)
	{
		super();
		this.studentService = studentService;
	}
	
	@GetMapping("/students")
	public String listStudents (Model model)
	{
//		Student student = new Student();
		model.addAttribute("Studentss",studentService.getAllStudent());
		
	    return "students";
		
		
	}
	@GetMapping("/students/new")
	public String createStudentForm(Model model)
	{
		Student student = new Student();
		model.addAttribute("student", student);
		return "create_student";
		
	}
	
	@GetMapping("/student")
	public String saveStudent(@ModelAttribute("student") Students student)
	{
		studentService.saveStudent(student);
		return "redirect:/students";
	}
	
	@GetMapping("/students/edit/{first_Name}")
	public String editStudentForm(@PathVariable String first_Name, Model model)
	{
		Students student = new Students();
		model.addAttribute("student", studentService.updateStudent(student));
		return "edit_student";
		
		
	}
	
}
