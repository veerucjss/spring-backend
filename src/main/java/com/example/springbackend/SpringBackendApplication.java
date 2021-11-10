package com.example.springbackend;

import com.example.springbackend.model.Employee;
import com.example.springbackend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBackendApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBackendApplication.class, args);
	}

}
