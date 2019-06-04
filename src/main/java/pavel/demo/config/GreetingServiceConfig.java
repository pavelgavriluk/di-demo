package pavel.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import pavel.demo.services.GreetingRepository;
import pavel.demo.services.GreetingService;
import pavel.demo.services.GreetingServiceFactory;

@Configuration
public class GreetingServiceConfig {

	@Bean
	GreetingServiceFactory greetingServiceFactory(GreetingRepository repository){
		return new GreetingServiceFactory(repository);
	}

	@Bean
	@Primary
	@Profile({"default", "en"})
	GreetingService primaryGreetingService(GreetingServiceFactory greetingServiceFactory){
		return greetingServiceFactory.createGreetingService("en");
	}

	@Bean
	@Primary
	@Profile("es")
	GreetingService primarySpanishGreetingService(GreetingServiceFactory greetingServiceFactory) {
		return greetingServiceFactory.createGreetingService("es");
	}

	@Bean
	@Primary
	@Profile("ru")
	GreetingService primaryRussianGreetingService(GreetingServiceFactory greetingServiceFactory) {
		return greetingServiceFactory.createGreetingService("ru");
	}


}
