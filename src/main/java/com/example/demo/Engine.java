package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class Engine {  
	
	public Engine() {
        System.out.println("hello engine");
	}
	@Bean
	public Car newInstance()
	{
		Car cr=new Car();
		return cr;
	}
}
