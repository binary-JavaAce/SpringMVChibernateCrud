package springmvc2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import springmvc2.service.StudentService;

@Controller
public class LoginController {
	
	@Autowired
	StudentService service;

	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView hello () {
		ModelAndView m=new ModelAndView();
		m.setViewName("login");
		return m;
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public ModelAndView login (@RequestParam("username") String name, @RequestParam("password") String password, Model m) {
		ModelAndView mv=new ModelAndView();
		if(name.equalsIgnoreCase("Preeti") && password.equals("admin")) {
			m.addAttribute("students", service.getStudents());
			m.addAttribute("title", "Student List");
			
			mv.setViewName("StudentList");
			return mv;
		
		}
		else {
			mv.setViewName("error");
			return mv;
		}
	}
	
}
