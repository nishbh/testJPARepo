package com.example.springDataJPASample1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class SpringDataJpaSample1Application implements CommandLineRunner {

	@Autowired
	private EmployeeRepository repo;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaSample1Application.class, args);
	}
	
	@Override
	public void run(String... args) {
 		Employee employee = new Employee();
		employee.setFirstName("Prasad");
		employee.setLastName("Kharkar");
		employee.setSalary(new Long(123566));
		repo.save(employee);
	}

}
