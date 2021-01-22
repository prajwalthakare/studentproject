package com.java.configration;

import org.hibernate.usertype.UserType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.java.entity.Project;
import com.java.entity.User;


public class hibernate_config {
	@Autowired
	ApplicationContext context;
	
@Bean
	public LocalSessionFactoryBean sessionfactory(){
	System.out.println("HibernateConfiguration---getBean()");
	LocalSessionFactoryBean factorybean=new LocalSessionFactoryBean();
	factorybean.setConfigLocation(context.getResource("classpath:hibernate.cfg.xml"));
	factorybean.setAnnotatedClasses(User.class,Project.class);
	return factorybean;
	}
}
