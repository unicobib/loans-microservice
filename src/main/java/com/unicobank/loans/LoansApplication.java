package com.unicobank.loans;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@OpenAPIDefinition(
		info = @Info(
				title = "Loans microservice REST API Documentation",
				description = "UnicoBank Loans microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Bibek Dey",
						email = "bibek.125060@gmail.com"
				),
				license = @License(
						name = "MIT License",
						url = "https://opensource.org/license/mit"
				)
		)
)
@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
public class LoansApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoansApplication.class, args);
	}

}
