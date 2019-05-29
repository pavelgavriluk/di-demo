package pavel.demo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

	public static final String HELLO = "Hello all!";

	@Override
	public String sayGreeting() {
		return HELLO;
	}
}
