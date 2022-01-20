package com.graphql.poc.repo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.graphql.poc.pojo.Employee;

@Component
public class EmployeeRepo {

	public List<Employee> employees = new ArrayList<>();
	
	public EmployeeRepo(){
		initEmployee();
	}
	
	public List<Employee> getAllEmplloyees() {
		return this.employees;
	}

	private void initEmployee() {
		Employee empl = new Employee(1,"Pankaj",30,1);			
		
		Employee emp2 = new Employee(2,"Pankaj 2",31, 2);
		
		employees.add(emp2);
		employees.add(empl);
		
	}

	public Employee empById(int id) {
		
		List<Employee> emps = this.employees.stream()
				.filter(e -> e.getId() == id)
				.collect(Collectors.toList());
		return emps.size() > 0 ? emps.get(0) : null;
		
	}

	public Employee addEmp(String name, int age) {
		Employee emp = new Employee(this.employees.size()+1, name, age, 1);
		this.employees.add(emp);
		return emp;
	}
	
	
	
}
