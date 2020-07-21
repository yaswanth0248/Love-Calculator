package com.AppicationConfigurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.ApplicationFormatters.PhoneNoFormatter;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.ApplicationControllers")
public class ApplicationConfig implements WebMvcConfigurer{

	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver VR = new InternalResourceViewResolver("/WEB-INF/View/", ".jsp");
		return VR;

	}
	@Override
	public void addFormatters(FormatterRegistry registry) {
	registry.addFormatter(new PhoneNoFormatter());
	}

}
