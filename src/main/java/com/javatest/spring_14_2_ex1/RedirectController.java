package com.javatest.spring_14_2_ex1;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


// Controller에 없으면 404에러 뜸

@Controller
public class RedirectController {

	@RequestMapping("/index1")
	public String goIndex() {
		
		
		return "index1";
	}
	
	@RequestMapping(value="/student", method=RequestMethod.GET)
	public String goStudent(HttpServletRequest httpservletRequest, Model model) {
		
		String pid = httpservletRequest.getParameter("id");
		if(pid.equals("tiger")) {
			return "redirect:studentOk"; // RequestMapping의 value(/studentOk)로 이동
		}
		return "redirect:studentNg";
	}
	
	@RequestMapping(value = "/studentOk")
	public String studentOk() {
		return "student/studentOk"; // student 폴더 안의 studentOk.jsp로 이동
	}
	
	@RequestMapping(value = "/studentNg")
	public String studentNg() {
		return "student/studentNg"; // student 폴더 안의 studentNg.jsp로 이동
	}
	
	
	
	@RequestMapping(value = "/feel")
	public String goFeel() {
		
		return "redirect:http://localhost8888/spring_14_2_ex1/good";
	}
	
	@RequestMapping(value = "/good")
	public String goGood() {
		
		return "good";
	}
}
