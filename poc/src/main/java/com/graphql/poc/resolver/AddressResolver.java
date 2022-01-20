package com.graphql.poc.resolver;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.graphql.poc.pojo.Address;
import com.graphql.poc.pojo.Employee;
import com.graphql.poc.repo.AddressRepo;

@Component
public class AddressResolver implements GraphQLResolver<Employee> {
	
	@Autowired
	private AddressRepo repo;
	
	public Address address(Employee emp) {
		
		List<Address> adds = repo.addresses.stream()
				.filter(e -> e.getId() == emp.getAddressId())
				.collect(Collectors.toList());
		
		return adds.size() > 0 ? adds.get(0) : null;
		
	}

}
