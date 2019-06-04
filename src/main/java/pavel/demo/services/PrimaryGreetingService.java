package pavel.demo.services;

public class PrimaryGreetingService implements GreetingService{

	// fields
	private GreetingRepository greetingRepository;

	// constructors
	public PrimaryGreetingService(GreetingRepository greetingRepository) {
		this.greetingRepository = greetingRepository;
	}

	@Override
	public String sayGreeting() {
		return greetingRepository.getEnglishGreeting();
	}
}
