package com.graphql.poc.repo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.graphql.poc.pojo.Address;

@Component
public class AddressRepo {
	
	public List<Address> addresses = new ArrayList<>();
	
	public AddressRepo() {
		initAddress();
	}

	private void initAddress() {
		Address add1 = new Address(1, "Pune", "India");
		Address add2 = new Address(2, "Delhi", "India");
		
		addresses.add(add1);
		addresses.add(add2);
	}
	
	public Address getAddressById(int id) {
		List<Address> adds = addresses.stream()
				.filter(a -> a.getId() == id)
				.collect(Collectors.toList());
		return adds.size() > 0 ? adds.get(0) : null;
		
	}

}
