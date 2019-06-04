package pavel.demo.services;

public class PrimarySpanishGreetingService implements GreetingService{

	// fields
	private GreetingRepository greetingRepository;

	// constructors
	public PrimarySpanishGreetingService(GreetingRepository greetingRepository) {
		this.greetingRepository = greetingRepository;
	}

	@Override
	public String sayGreeting() {
		return greetingRepository.getSpanishGreeting();
	}
}
