package com.ujjwal.rest.webservices.restfulwebservices.helloworld;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.CrossOrigin;

//Controller
@RestController
//http://localhost:4200
@CrossOrigin(origins="http://localhost:4200")
public class HelloWorldController {
	
	
	//Get
	//URI - /hello-world
	//Method - "Hello World"
	
	@GetMapping(path="/hello-world")
	public String helloWorld() {
		return "Hello World !!!";
	}
	
	@GetMapping(path="/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World Bean !!!");
	}
	
	//hello-world-bean/path-variable/ujjwaltripathi
	@GetMapping(path="/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldPathVaribale(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello World, %s", name ));
	}
	
}
