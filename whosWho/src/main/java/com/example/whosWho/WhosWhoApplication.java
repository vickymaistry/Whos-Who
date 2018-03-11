package com.example.whosWho;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.example.whosWho.Domain.TeamMember;

@SpringBootApplication
@EnableJpaRepositories
@ComponentScan("com.example.whosWho.*")
public class WhosWhoApplication {

	public static void main(String[] args) {
		SpringApplication.run(WhosWhoApplication.class, args);
	}
	
	
	
	
}
