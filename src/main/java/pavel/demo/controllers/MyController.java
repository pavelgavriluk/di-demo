package pavel.demo.controllers;

import org.springframework.stereotype.Controller;

import pavel.demo.services.GreetingService;

@Controller
public class MyController {

	// fields
	private GreetingService greetingService;

	// constructors
	public MyController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String hello(){
		System.out.println("Hello!");
		return greetingService.sayGreeting();
	}

}
