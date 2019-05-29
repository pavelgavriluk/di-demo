package pavel.demo.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import pavel.demo.services.GreetingServiceImpl;

public class ConstructorInjectedControllerTest {

	// fields
	private ConstructorInjectedController constructorInjectedController;

	@Before
	public void setUp(){
		this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
	}

	@Test
	public void testGreeting(){
		assertEquals(GreetingServiceImpl.HELLO, constructorInjectedController.sayHello());
	}
}
