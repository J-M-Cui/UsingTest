package com.test.springboot;

import org.springframework.boot.context.web.SpringBootServletInitializer;

public class SpringBootWebApplication extends SpringBootServletInitializer {

	 @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(SpringBootWebApplication.class);
	    }

	    public static void main(String[] args) throws Exception {
	        SpringApplication.run(SpringBootWebApplication.class, args);
	    }
}
