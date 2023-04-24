package com.company.swaggeropenapi.swaggeropenapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/ee")
public class SwaggerOpenApi3 {
	
	private Logger logger = LoggerFactory.getLogger(SwaggerOpenApi3.class);
	private List<Employee> employee = Arrays.asList(
			new Employee(100L,"John", "Male", "IT", 353864892357L ),
			new Employee(101L,"Key", "Male", "HR", 353864898957L ),
			new Employee(102L,"Ita", "Female", "Admin", 353864892357L ),
			new Employee(103L,"John", "Male", "Marketing", 353864892357L )
			);
	
	
	@Operation(method = "Get", description = "This api is for fetchign emaployees", summary = "This method will return all the employees" )
	@GetMapping("/employees")
	public List<Employee> fetchAllEmployee() {
		return employee;
	}
	
	
	@GetMapping("/employee/id/{id}")
	public Employee fetchEmployee(@PathVariable long id){
		logger.info("Employee Id is {}",id);
		return employee.stream().filter(e -> e.getEmployeeId()==id).findFirst().orElse(null);
	}
	
	@PostMapping("/employee")
	public List<Employee> addEmployee(@RequestBody Employee newEmployee ){
		logger.info("List Size Is : "+employee.stream().count());
		System.out.println("new Employee = "+newEmployee);
		//employee.add(newEmployee);
		//employee.add(5, newEmployee);
		List<Employee> newEmployeeList = new ArrayList<Employee>(employee);
		newEmployeeList.add(newEmployee);
		logger.info("List Size Is : "+newEmployeeList.stream().count());
		newEmployeeList.stream().forEach(e->System.out.println(e));
		return employee;
	}
	 	
}