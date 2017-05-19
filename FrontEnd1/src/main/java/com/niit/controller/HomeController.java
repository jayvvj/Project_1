package com.niit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping(value={"/","/index"})
	public String gohome(){
		return "index";
	}
	@RequestMapping("/signup")
	public String gosignup(){
		return "Signup";
	}
	@RequestMapping("/signin")
	public String gosignin(){
		return "Signin";
	}
	@RequestMapping("/contact")
	public String gocontact(){
		return "contact";
	}	
	@RequestMapping("/about")
	public String goabout(){
		return "about";
	}	
	
	
	
	@RequestMapping("/Apple")
	public String apple(){
		return "Apple";
	}	
	@RequestMapping("/Asus")
	public String asus(){
		return "Asus";
	}	
	@RequestMapping("/DELL")
	public String dell(){
		return "DELL";
	}	
	@RequestMapping("/HP")
	public String hp(){
		return "HP";
	}	
	@RequestMapping("/Lenovo")
	public String Lenovo(){
		return "Lenovo";
	}
}