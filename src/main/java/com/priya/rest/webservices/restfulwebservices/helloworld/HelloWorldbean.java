package com.priya.rest.webservices.restfulwebservices.helloworld;

public class HelloWorldbean {

	private String message;

	@Override
	public String toString() {
		return "HelloWorldbean [message=" + message + "]";
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public HelloWorldbean(String message) {
		// TODO Auto-generated constructor stub
		this.message = message;
	}

}
