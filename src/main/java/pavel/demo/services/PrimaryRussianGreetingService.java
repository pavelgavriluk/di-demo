package pavel.demo.services;

public class PrimaryRussianGreetingService implements GreetingService{

	// fields
	private GreetingRepository greetingRepository;

	// constructors
	public PrimaryRussianGreetingService(GreetingRepository greetingRepository) {
		this.greetingRepository = greetingRepository;
	}

	@Override
	public String sayGreeting() {
		return greetingRepository.getRussianGreeting();
	}
}
