package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.Student;

@Controller
public class ThymeleafController {

	@RequestMapping("/helloworld")
	private String hello() {
		return "home";
	}

	@RequestMapping("/senddata")
	public ModelAndView sendDataToTemplate() {
		ModelAndView mav = new ModelAndView("data");
		mav.addObject("sampletext", "This is a demo data to template!");
		return mav;
	}

	@RequestMapping("/snedobject")
	public ModelAndView sendObject() {
		ModelAndView mav = new ModelAndView("student");
		Student student = new Student();
		student.setName("John");
		student.setScore(99);
		mav.addObject("student", student);
		return mav;
	}

	@GetMapping("/student")
	public String studentForm(Model model) {
		model.addAttribute("student", new Student());
		return "studentform";
	}
	
	@PostMapping("/student")
	  public String greetingSubmit(@ModelAttribute Student student) {
	    return "studentres";
	  }

}
