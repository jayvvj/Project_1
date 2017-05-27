package com.niit.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.abc.BackEnd1.model.Category;
import com.abc.BackEnd1.dao.CategoryDAO;
import com.abc.BackEnd1.model.Customer;
import com.abc.BackEnd1.dao.CustomerDAO;
import com.abc.BackEnd1.model.Product;
import com.abc.BackEnd1.dao.ProductDAO;
import com.abc.BackEnd1.model.Supplier;
import com.abc.BackEnd1.dao.SupplierDAO;

@Controller
public class HomeController {
	
	static AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();	
	static CustomerDAO customerDAO;
	static CategoryDAO categoryDAO;
	static ProductDAO productDAO;
	static SupplierDAO supplierDAO;
	
	static{
		ctx.scan("com.abc.BackEnd1");
		ctx.refresh();		
		customerDAO = (CustomerDAO)ctx.getBean("customerDAO");
		productDAO = (ProductDAO)ctx.getBean("productDAO");
		categoryDAO = (CategoryDAO)ctx.getBean("categoryDAO");
		supplierDAO = (SupplierDAO)ctx.getBean("supplierDAO");
	}

	@RequestMapping(value={"/","/home"})
	public String gohome(){
		return "index";
	}
	@RequestMapping("/signup")
	public String gosignup(){
		return "Signup";
	}
	
	@RequestMapping("/registercustomer")
	public String doRegister(HttpServletRequest req){
		Customer c = new Customer();
		c.setName(req.getParameter("name"));
		c.setEmail(req.getParameter("email"));
		c.setPwd(req.getParameter("pwd"));
		c.setCPwd(req.getParameter("cpwd"));
		c.setAddr(req.getParameter("addr"));
		c.setPhno(req.getParameter("phno"));
		if(customerDAO.addCustomer(c))
			return "Signin";
		else
			return "Signup";
	}
	
	@RequestMapping("/registerproduct")
	public String doRegisterProduct(HttpServletRequest req){
		Product p = new Product();
		p.setName(req.getParameter("pname"));
		p.setPId(req.getParameter("pid"));
		p.setPrice(req.getParameter("price"));
		p.setDesc(req.getParameter("desc"));
		p.setQuantity(Integer.parseInt(req.getParameter("quantity")));
		if(productDAO.addProduct(p))
			return "";
		else
			return "";
	}
	
	@RequestMapping("/registercategory")
	public String doRegisterCategory(HttpServletRequest req){
		Category c = new Category();
		c.setName(req.getParameter("name"));
		c.setCatId(req.getParameter("CatId"));
		if(categoryDAO.addCategory(c))
			return "";
		else
			return "";
	}
	
	@RequestMapping("/registersupplier")
	public String doRegisterSupplier(HttpServletRequest req){
		Supplier s = new Supplier();
		s.setName(req.getParameter("name"));
		s.setSId(req.getParameter("SId"));
		if(supplierDAO.addSupplier(s))
			return "";
		else
			return "";
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
	@RequestMapping("/addproduct")
	public String goproduct(){
		return "AddProduct";
	}
	@RequestMapping("/addcategory")
	public String gocategory(){
		return "AddCategory";
	}
	@RequestMapping("/addsupplier")
	public String gosupplier(){
		return "AddSupplier";
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