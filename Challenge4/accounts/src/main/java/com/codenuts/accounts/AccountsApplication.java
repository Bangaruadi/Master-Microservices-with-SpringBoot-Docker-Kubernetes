package com.codenuts.accounts;

import com.codenuts.accounts.dto.AccountsContactsInfoDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
/*@ComponentScans({ @ComponentScan("com.eazybytes.accounts.controller") })
@EnableJpaRepositories("com.eazybytes.accounts.repository")
@EntityScan("com.eazybytes.accounts.model")*/
@EnableConfigurationProperties(AccountsContactsInfoDto.class)
@OpenAPIDefinition(
        info = @Info(
                title = "Accounts microservice REST API Documentation",
                description = "CodeNuts Accounts microservice REST API Documentation",
                version = "v1",
                contact = @Contact(
                        name = "Aditya Bharadwaj",
                        email = "tutor@codenuts.com",
                        url = "https://eazybytes.com/"
                ),
                license = @License(
                        name = "Apache 2.0",
                        url = "https://eazybytes.com/"
                )
        ),
        externalDocs = @ExternalDocumentation(
                description =  "CodeNuts Accounts microservice REST API Documentation",
                url = "https://www.codenuts.com/swagger-ui.html"
        )
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
