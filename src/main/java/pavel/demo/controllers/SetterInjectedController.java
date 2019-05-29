package pavel.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import pavel.demo.services.GreetingService;

@Component
public class SetterInjectedController {

	// fields
	private GreetingService greetingService;

	// methods
	public String sayHello() {
		return greetingService.sayGreeting();

	}

	// Setters and Getters
	@Autowired
	public void setGreetingService(@Qualifier("setterGreetingService") GreetingService greetingService) {
		this.greetingService = greetingService;
	}
}
