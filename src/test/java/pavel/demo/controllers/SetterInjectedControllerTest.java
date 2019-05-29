package pavel.demo.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import pavel.demo.services.GreetingServiceImpl;

public class SetterInjectedControllerTest {

	// fields
	private SetterInjectedController setterInjectedController;

	@Before
	public void setUp(){
		this.setterInjectedController = new SetterInjectedController();
		this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
	}

	@Test
	public void testGreeting(){
		assertEquals(GreetingServiceImpl.HELLO, setterInjectedController.sayHello());
	}
}
