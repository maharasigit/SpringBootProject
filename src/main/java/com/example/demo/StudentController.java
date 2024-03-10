package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/addStudent")
	public String getAddStudPage(Model model)
	{
		Student student = new Student();
        model.addAttribute("student", student);
		return "newStudent";
	}
	
	@PostMapping("/saveStudent")
    public String saveEmployee(@ModelAttribute("student") Student student) {
		System.out.println("Add Student Id::"+student.getId()+":: Name ::"+student.getName()+":: Department ::"+student.getDepartment());
        studentService.addStudent(student);
        return "student";
    }
	
	/*@PostMapping("/authenticate")
    public ResponseEntity authenticate() {
		
        return ResponseEntity.ok();
    }*/
	
	
	@RequestMapping(value="/getAllStudents",method=RequestMethod.GET)
	public String getStudentDetails(Model model)
	{
		
		model.addAttribute("allstudlist", studentService.getStudentDetails());
		return "studentDetails";
	}
}
