package springmvc2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import springmvc2.model.Student;
import springmvc2.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	StudentService service;
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public ModelAndView addStudent() {
		ModelAndView m=new ModelAndView();
		m.setViewName("addStudent");
		return m;
	}
	
	@RequestMapping(value="/insert", method=RequestMethod.POST)
	public ModelAndView insertStudent(@RequestParam("name") String name, @RequestParam("age") String age,@RequestParam("college") String college ) {
		ModelAndView m=new ModelAndView();
		Student s=new Student();
		s.setName(name); 
		s.setAge(age);
		s.setCollege(college);
		System.out.println("Student Details :"+s);
		service.addStudent(s);
		m.setViewName("redirect:/studentList");
		return m;
	}
	
	@RequestMapping(value="/studentList", method=RequestMethod.GET)
	public ModelAndView studentList(Model m) {
		m.addAttribute("students", service.getStudents());
		m.addAttribute("title", "Add Student");
		ModelAndView mv=new ModelAndView();
		mv.setViewName("studentList");
		return mv;
		
	}
	
	@RequestMapping("/editStudent/{id}")
	public ModelAndView updateStudentForm(@PathVariable(value="id") int id, Model m)
	{
		Student s=service.getStudentById(id);
		
		System.out.println(s);
		m.addAttribute("student", s);
		m.addAttribute("title", "Update Student");
		ModelAndView mv=new ModelAndView();
		mv.setViewName("editStudent");
		return mv;
	}
	
	@RequestMapping(value="/editStudent/update",  method=RequestMethod.POST)
	public String updateEmp(@ModelAttribute("update") Student s)	{
		service.updateStudent(s);
		return "redirect:/studentList";
	}
	
	
	
	
	@RequestMapping(value="/deleteStudent/{id}", method=RequestMethod.GET)
	public String deleteEmployee(@PathVariable("id") int id){
		service.deleteStudent(id);
		return "redirect:/studentList";
	}
	
}
