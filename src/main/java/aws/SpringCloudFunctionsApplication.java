package aws;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.function.context.FunctionalSpringApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

@SpringBootApplication
public class SpringCloudFunctionsApplication {

	public static void main(String[] args) {
		FunctionalSpringApplication.run(SpringCloudFunctionsApplication.class, args);
	}

	@Bean
	public Function<String,String> toUpperCase() {
		return (value) -> new StringBuilder(value).toString().toUpperCase();
	}

	@Bean
	public Supplier<String> getMessage() {
		return () -> "Welcome to Daily Code Buffer!!!";
	}

	@Bean
	public Consumer<String> writeMessage() {
		return (value) -> System.out.println(value);
	}

}
