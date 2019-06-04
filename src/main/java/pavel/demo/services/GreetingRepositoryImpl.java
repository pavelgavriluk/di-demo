package pavel.demo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingRepositoryImpl implements GreetingRepository {

	@Override
	public String getEnglishGreeting() {
		return "Hello - Primary Greeting service";
	}

	@Override
	public String getRussianGreeting() {
		return "Здравствуйте! - первичная служба приветствия";
	}

	@Override
	public String getSpanishGreeting() {
		return "Hola - Servicio de saludo primario";
	}
}
