package net.lirent.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("net.lirent")
public class SpringBootAuthenticationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAuthenticationApplication.class, args);
	}

}
