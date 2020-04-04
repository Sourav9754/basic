/**
 * 
 */
package com.demo.basic.endpoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.demo.basic.bean.Address;
import com.demo.basic.bean.Name;
import com.demo.basic.bean.UserDetails;
import com.demo.basic.service.DemoService;

/**
 * @author Sourav Biswas
 *
 */
@RestController
public class Endpoint {
	
	@Autowired
	private DemoService demoService;

	@GetMapping("/hello_world")
	public String helloWorld() {
		return "Hello World";
	}
	@GetMapping("/testing")
	public String TesTing() {
		return "Riju is great";
	}
	
	@GetMapping("/hello_worldbyclass")
	public List<Name> helloWorldByClass() {
		return demoService.retriveAllName();
	}
	@GetMapping("/user_details")
	public UserDetails userByClass() {
		UserDetails userDetails =  new UserDetails();
		userDetails.setAddress("New Barrackpore");
		userDetails.setName(new Name("Dinesh","Sikder"));
		userDetails.setPhoneNo(85258);
		
		return userDetails;
	}
	@GetMapping("/user_address")
	public List<Address> addressByClass() {		
		return demoService.retriveAllData();
	}
	
	
	@GetMapping("/messgae/{name}")
	public String getmessgaeFromPath(@PathVariable("name") String name) {		
		return "Good evening "+name;
	}
}
