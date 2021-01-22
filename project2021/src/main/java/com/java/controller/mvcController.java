package com.java.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.java.entity.Project;
import com.java.entity.User;
import com.java.servise.mvcServise;


@ComponentScan("com.java")
@Controller
@EnableWebMvc
public class mvcController {
	@Autowired
	 mvcServise mvcser;
   
	@RequestMapping("/loginpage")
	public String openloginpage() {
		
		return "login";
	}
	
	
	@RequestMapping("/login")
	public ModelAndView checkloging(@ModelAttribute User user){
		ModelAndView mv=new ModelAndView();
		
		boolean result=mvcser.checklogin(user);
		System.out.println("7777");
		
		if(result){
			System.out.println(user.getStudentname());
			
			mv.setViewName("redirect:/home");
		}
		else{
			mv.setViewName("login");
		}
		return mv;
	}
	
	/*@RequestMapping("/homepage")
	public String openhome() {
		
		return "/home";
	}*/
	
	@RequestMapping("/home")
	public  ModelAndView openhomepage(){
		System.out.println("1111111");
		ModelAndView mv=new ModelAndView();
		List<User> listuser=mvcser.getuser();
		if(!listuser.isEmpty()){
			mv.addObject("list",listuser);
			mv.setViewName("home");
		}
		else{
			
			mv.addObject("list",listuser);
			mv.setViewName("login");
		}
	
		return mv;
		
	}
	
	@RequestMapping("/deleteuser")
	public ModelAndView deleteuser(@RequestParam("id") String id){
		
		ModelAndView mv=new ModelAndView();
		int userid=Integer.parseInt(id);
		//mvcser.deleteuser(userid);
		
		if(mvcser.deleteuser(userid)){
			
			List<User> listuser=mvcser.getuser();
			mv.addObject("list",listuser);
			mv.setViewName("home");
			//mv.addObject("msg", "delete sucessfully");
		}
		else{
			mv.addObject("msg", "something wnt wrong");
		}
		
		
		return mv;
		
		
	}

	@RequestMapping("/update")
	public ModelAndView getUser(@RequestParam("id") String id)
	{
		ModelAndView mv=new ModelAndView();
		int userid=Integer.parseInt(id);
		List<User>listuser=mvcser.getUser(userid);
		if(!listuser.isEmpty())
		{
			mv.addObject("list", listuser);
			mv.setViewName("update");
		}
		else
		{
			mv.addObject("msg", "Something went wrong!");
			mv.setViewName("home");
		}
		return mv;
	}
	
	
	@RequestMapping("/updateparticularuser")
	public ModelAndView update(@ModelAttribute User user)
	{
		ModelAndView mv=new ModelAndView();
		System.out.println("11onjiii");
		if(mvcser.updateuser(user))
		{
			System.out.println("11ttt");
			 List<User> listuser=mvcser.getuser();
			 System.out.println("11oooo");
			 mv.addObject("list", listuser);
			 mv.setViewName("home");
		}
		else
		{
			mv.addObject("msg", "something Went Wrong!");
		}
		return mv;
	}


	@RequestMapping("/adduser")
	public String openAdduser()
	{
		return "adduser";
	}
	
	
	@RequestMapping("/adduserpage")
	public ModelAndView adduser(@ModelAttribute User user)
	{
		ModelAndView mv=new ModelAndView();
		if(mvcser.adduser(user))
		{
			 List<User> listuser=mvcser.getuser();
			 mv.addObject("list", listuser);
			 mv.setViewName("redirect:/home");
		}
		else
		{
			mv.addObject("msg", "something Went Wrong!");
		}
		return mv;
	}
	
	
	@RequestMapping("/project")
	public  ModelAndView openproject(){
		System.out.println("2222222");
		ModelAndView mv=new ModelAndView();
		List<Project> listp=mvcser.getpro();
		if(!listp.isEmpty()){
			mv.addObject("list",listp);
			mv.setViewName("project");
		}
		else{
			
			mv.addObject("list",listp);
			mv.setViewName("home");
		}
	
		return mv;
		
	}
	
	@RequestMapping("/deleteproject")
	public ModelAndView deleteproject(@RequestParam("id") String id){
		
		ModelAndView mv=new ModelAndView();
		int proid=Integer.parseInt(id);
		//mvcser.deleteuser(userid);
		
		if(mvcser.deletepro(proid)){
			
			List<Project> listuser=mvcser.getpro();
			mv.addObject("list",listuser);
			mv.setViewName("project");
			//mv.addObject("msg", "delete sucessfully");
		}
		else{
			mv.addObject("msg", "something wnt wrong");
		}
		
		
		return mv;
	
}
	@RequestMapping("/updateproject")
	public ModelAndView getpro(@RequestParam("id") String id)
	{
		ModelAndView mv=new ModelAndView();
		int proid=Integer.parseInt(id);
		List<Project>listpro=mvcser.getpro(proid);
		if(!listpro.isEmpty())
		{
			mv.addObject("list", listpro);
			mv.setViewName("updateproject");
		}
		else
		{
			mv.addObject("msg", "Something went wrong!");
			mv.setViewName("home");
		}
		return mv;
	}
	
	@RequestMapping("/updateparticularproject")
	public ModelAndView updateproject(@ModelAttribute Project pro)
	{
		ModelAndView mv=new ModelAndView();
		System.out.println("11onjiii");
		if(mvcser.updatepro(pro))
		{
			System.out.println("11ttt");
			 List<Project> listpro=mvcser.getpro();
			 System.out.println("11oooo");
			 mv.addObject("list", listpro);
			 mv.setViewName("project");
		}
		else
		{
			mv.addObject("msg", "something Went Wrong!");
		}
		return mv;
	}
	

	@RequestMapping("/addproject")
	public String openAddpro()
	{
		return "addproject";
	}
	
	
	@RequestMapping("/addprojectpage")
	public ModelAndView addpro(@ModelAttribute Project pro)
	{
		ModelAndView mv=new ModelAndView();
		if(mvcser.addpro(pro))
		{
			 List<Project> listpro=mvcser.getpro();
			 mv.addObject("list", listpro);
			 mv.setViewName("redirect:/project");
		}
		else
		{
			mv.addObject("msg", "something Went Wrong!");
		}
		return mv;
	}
}
