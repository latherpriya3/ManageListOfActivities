package com.priya.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class HelloWorldController {
	
	@GetMapping( path = "/helloWorld")
	public String helloWorld() {
		 return "Hello Priya! are you happy now  ";
	}
	@GetMapping( path = "/helloWorldBean")
	public HelloWorldbean helloWorldBean() {
		 return new HelloWorldbean("Hello Priya Lather ! I am happy now");
	}
	
	@GetMapping( path = "/helloWorld/PathVariable/{name}")
	public HelloWorldbean helloWorldPathVariable(@PathVariable String name) {
		 return new HelloWorldbean(String.format("Hello World, %s",name));
	}

}
