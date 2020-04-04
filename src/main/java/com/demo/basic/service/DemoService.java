package com.demo.basic.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.basic.bean.Address;
import com.demo.basic.bean.Name;

@Service
public class DemoService {

	@Autowired
	private Address address;
	
	@Autowired
	private Name name;
	
	public List<Address> retriveAllData() {
		List<Address> list = new ArrayList<Address>();
		address.setId(1);
		address.setCity("BBSR");
		address.setHouseNo(438);
		address.setPinCode(751024);
		address.setRoadName("KIIT Road");
		list.add(address);
		list.add(address);
		return list;
	}
	
	public List<Name> retriveAllName(){
		List<Name> list = new ArrayList<Name>();
		name.setFirstName("Mia");
		name.setLastName("Sikder");
		list.add(name);
		name.setFirstName("Lisa");
		name.setLastName("Chakladar");
		list.add(name);
		return list;
	}
	
	
	
	
}
