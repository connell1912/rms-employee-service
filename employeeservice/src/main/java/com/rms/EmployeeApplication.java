package com.rms;

import com.rms.dao.EmployeeDao;
import com.rms.model.Department;
import com.rms.model.Employee;
import com.rms.model.Role;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

// @EnableEurekaClient
@SpringBootApplication
public class EmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
	} 

	@Bean
	CommandLineRunner runner(EmployeeDao ed) {
		return args -> {
			// Employee e = new Employee();
			// e.setFirstName("Thomas");
			// e.setLastName("Wayne");
			// e.setEmail("gotham@email.com");
			// e.setPassword("batdad777");
			// e.setRole(Role.BLDG_MNGR);
			// ed.save(e);
			// ed.save(new Employee("Joseph","Joestar","overdriver@email.com","verynice",Department.STAGING,Role.BLDG_MNGR));
			// ed.save(new Employee("Ceasar","Zeppeli","bubble@email.com","wammuuuu",Department.TRAINING,Role.TRAINER));
			// ed.save(new Employee("Lisa","Lisa","teach@email.com","hamon",Department.QC,Role.TRNG_MNGR));
			// ed.save(new Employee("dfty","24356","nartesdf@email.com","fghg",Department.QC,Role.LOCKED));
		};
	}

}
