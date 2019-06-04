package pavel.demo.services;

public class GreetingServiceFactory {

	// fields
	private GreetingRepository greetingRepository;

	// constructors
	public GreetingServiceFactory(GreetingRepository greetingRepository) {
		this.greetingRepository = greetingRepository;
	}


	public GreetingService createGreetingService(String lang) {

		switch (lang) {
			case "en":
				return new PrimaryGreetingService(greetingRepository);
			case "es":
				return new PrimarySpanishGreetingService(greetingRepository);
			case "ru":
				return new PrimaryRussianGreetingService(greetingRepository);
			default:
				return new PrimaryGreetingService(greetingRepository);
		}
	}
}
