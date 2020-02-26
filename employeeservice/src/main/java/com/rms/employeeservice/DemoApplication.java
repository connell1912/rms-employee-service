package com.rms.employeeservice;

import com.rms.dao.EmployeeDao;
import com.rms.model.Employee;
import com.rms.model.Role;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@EnableEurekaClient
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(EmployeeDao ed) {
		return args -> {
			Employee e = new Employee();
			e.setFirstName("Thomas");
			e.setLastName("Wayne");
			e.setEmail("gotham@email.com");
			e.setPassword("batdad777");
			e.setRole(Role.BLDG_MNGR);
			ed.save(e);
		};
	}

}
