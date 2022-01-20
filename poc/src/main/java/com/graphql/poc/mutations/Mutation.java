package com.graphql.poc.mutations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.graphql.poc.pojo.Employee;
import com.graphql.poc.repo.EmployeeRepo;

@Component
public class Mutation implements GraphQLMutationResolver{
	
	@Autowired
	private EmployeeRepo repo;
	
	public Employee addEmp(String name, int age) {
		return repo.addEmp(name, age);
	}

}
