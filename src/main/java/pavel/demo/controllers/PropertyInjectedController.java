package pavel.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import pavel.demo.services.GreetingService;
import pavel.demo.services.GreetingServiceImpl;

// NOT Recommended Way!!!

@Controller
public class PropertyInjectedController {

	// fields
	@Autowired
	@Qualifier("greetingServiceImpl")
	public GreetingService greetingServiceImpl;

	// methods
	public String sayHello(){
		return greetingServiceImpl.sayGreeting();
	}

}
