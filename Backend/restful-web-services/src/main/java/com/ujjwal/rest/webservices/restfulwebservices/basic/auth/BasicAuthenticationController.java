package com.ujjwal.rest.webservices.restfulwebservices.basic.auth;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Controller
@RestController
//http://localhost:4200
@CrossOrigin(origins="http://localhost:4200")
public class BasicAuthenticationController {
	
	
	//Get
	//URI - /hello-world
	//Method - "Hello World"
	
	
	
	@GetMapping(path="/basicauth")
	public AuthenticationBean helloWorldBean() {
		return new AuthenticationBean("You are Authenticated");
	}
	
	
}
