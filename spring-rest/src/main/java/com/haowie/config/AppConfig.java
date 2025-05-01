package com.haowie.config;

import java.util.List;
import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.haowie.model.Employee;

@Configuration
public class AppConfig {
	
	@Bean
	public List<Employee> employeeList(){
		
		List<Employee> employeeList=new ArrayList<>();
		employeeList.add(new Employee("1", "İsim1","Soyisim1"));
		employeeList.add(new Employee("2", "İsim2","Soyisim2"));
		employeeList.add(new Employee("3", "İsim3","Soyisim3"));
		employeeList.add(new Employee("4", "İsim4","Soyisim4"));
		
		return employeeList;

	}

}
