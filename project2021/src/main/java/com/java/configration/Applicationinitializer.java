package com.java.configration;


import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
public class Applicationinitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		System.out.println("Application Initializer-- getServletConfigClasses()");
		return new Class[]{WebMvcConfig.class,hibernate_config.class};
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		System.out.println("Application Initializer--getServletMappings()");
		return new String[]{"/"};
	}

}
