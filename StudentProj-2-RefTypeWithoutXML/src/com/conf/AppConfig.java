package com.conf;
// spring.xml =AppConfig

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bean.Address;
import com.bean.Student;

@Configuration
public class AppConfig {

	@Bean
	public Address address() {
		Address address = new Address();
		address.setLandMark("FC ROAD");
		address.setCity("PUNE");
		address.setPincode(444333);
		return address;
	}

	@Bean
	public Student student() {
		// CI Student student = new Student(11,"Raveena",66.77,address);
		Student student = new Student();
		student.setId(11);
		student.setName("Raveeena");
		student.setMarks(66.77);
		// Injecting Ref Bean By SI
		student.setAddress(address());

		return student;
	}

}