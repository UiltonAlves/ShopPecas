package br.com.shoppecas.configuration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.WebApplicationInitializer;

@Configuration
public class MyWebApplicationInitialize implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext) throws ServletException {
			servletContext.setInitParameter("spring.profiles.active", "DEV_postgresql");
	}

}
