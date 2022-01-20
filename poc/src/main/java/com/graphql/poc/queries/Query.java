package com.graphql.poc.queries;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.graphql.poc.pojo.Employee;
import com.graphql.poc.repo.EmployeeRepo;

@Component
public class Query implements GraphQLQueryResolver{
	
	@Autowired
	private EmployeeRepo repo;
	
	public String test() {
		return "Hello GraphQL";
	}
	
	public int sum(int a, int b) {
		return a+b;
	}
	
	public List<Employee> allEmp(){
		return repo.getAllEmplloyees();
	}
	
	public Employee empById(int id) {
		return repo.empById(id);
	}

}
