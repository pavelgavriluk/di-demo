package pavel.demo.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import pavel.demo.services.GreetingServiceImpl;

public class PropertyInjectedControllerTest {

	// fields
	private PropertyInjectedController propertyInjectedController;

	@Before
	public void setUp(){
		this.propertyInjectedController = new PropertyInjectedController();
		this.propertyInjectedController.greetingServiceImpl = new GreetingServiceImpl();
	}

	@Test
	public void testGreeting(){
		assertEquals(GreetingServiceImpl.HELLO, propertyInjectedController.sayHello());
	}
}
