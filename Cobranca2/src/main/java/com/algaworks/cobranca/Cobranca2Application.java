package com.algaworks.cobranca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class Cobranca2Application {

	public static void main(String[] args) {
		SpringApplication.run(Cobranca2Application.class, args);
	}
	
	@Configuration
	public static class MvcConfig extends WebMvcConfigurerAdapter{
		
		@Override
		public void addViewControllers(ViewControllerRegistry registry) {
			// TODO Auto-generated method stub
			super.addViewControllers(registry);
			
			registry.addRedirectViewController("/", "/titulos");
			
		}
		
	}
}
