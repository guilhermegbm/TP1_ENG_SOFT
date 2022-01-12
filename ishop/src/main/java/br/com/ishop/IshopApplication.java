package br.com.ishop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = {"br.com.ishop.repository"})
@SpringBootApplication
public class IshopApplication {

	public static void main(String[] args) {
		SpringApplication.run(IshopApplication.class, args);
	}

}
