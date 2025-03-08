package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
//conflict case1 remote
	conflict(){
	}

//local to remote-1
hello buddy1(){

}
	//remote to local-2
hello buddy2(){

}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
