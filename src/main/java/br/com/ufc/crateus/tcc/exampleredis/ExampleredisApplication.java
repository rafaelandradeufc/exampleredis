package br.com.ufc.crateus.tcc.exampleredis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class ExampleredisApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExampleredisApplication.class, args);
	}

}
