package com.Employee.Employeegroupp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EmployeeGrouppApplication {

	@GetMapping("/message")
	public String message(){
		return"Congrates ! your app deployed successfully in Azure !";
	}

	public static void main(String[] args) {
		SpringApplication.run(EmployeeGrouppApplication.class, args);
	}

}
