package pavel.demo.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import pavel.demo.services.GreetingService;

@Component
public class ConstructorInjectedController {

	// fields
	private GreetingService greetingService;

	// constructors
	public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	// methods
	public String sayHello(){
		return greetingService.sayGreeting();
	}
}
