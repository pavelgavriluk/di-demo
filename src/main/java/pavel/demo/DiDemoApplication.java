package pavel.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Primary;

import pavel.demo.controllers.ConstructorInjectedController;
import pavel.demo.controllers.MyController;
import pavel.demo.controllers.PropertyInjectedController;
import pavel.demo.controllers.SetterInjectedController;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DiDemoApplication.class, args);

		MyController controller = (MyController) context.getBean("myController");

		System.out.println(controller.hello());
		System.out.println(context.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(context.getBean(SetterInjectedController.class).sayHello());
		System.out.println(context.getBean(ConstructorInjectedController.class).sayHello());

	}

}
