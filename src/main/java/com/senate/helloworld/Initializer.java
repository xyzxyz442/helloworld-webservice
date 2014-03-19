package com.senate.helloworld;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class Initializer implements WebApplicationInitializer {

	public void onStartup(ServletContext context) throws ServletException {
		
		AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
		rootContext.setConfigLocation("com.senate.config");

		// Manage the lifecycle of the root application context
		context.addListener(new ContextLoaderListener(rootContext));

		// Create the dispatcher servlet's Spring application context
		AnnotationConfigWebApplicationContext dispatcherContext = new AnnotationConfigWebApplicationContext();
		dispatcherContext.setConfigLocation("com.senate.config");

		// Register and map the dispatcher servlet
		ServletRegistration.Dynamic dispatcher = context.addServlet(
				"dispatcher", new DispatcherServlet(dispatcherContext));
		dispatcher.setLoadOnStartup(1);
		dispatcher.addMapping("/*");
	}

}
