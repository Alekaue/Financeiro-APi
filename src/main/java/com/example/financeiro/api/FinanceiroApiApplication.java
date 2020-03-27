package com.example.financeiro.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;

import com.example.financeiro.api.config.property.FinanceiroApiProperty;

@SpringBootApplication
@EnableConfigurationProperties(FinanceiroApiProperty.class)
public class FinanceiroApiApplication {

	private static ApplicationContext APPLICATIONCONTEXT;
	
	public static void main(String[] args) {
		APPLICATIONCONTEXT = SpringApplication.run(FinanceiroApiApplication.class, args);
	}
	
		public static <T> T getBean(Class<T> type) {
			return APPLICATIONCONTEXT.getBean(type);
		}
}
