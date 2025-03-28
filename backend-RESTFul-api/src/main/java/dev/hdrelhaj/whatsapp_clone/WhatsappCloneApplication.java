package dev.hdrelhaj.whatsapp_clone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.security.OAuthFlow;
import io.swagger.v3.oas.annotations.security.OAuthFlows;
import io.swagger.v3.oas.annotations.security.SecurityScheme;

/**
 * Main class for the application
 * <p>
 * This class is the entry point of the application
 * </p>
 *
 * @author Abdelrehman Elhaj
 */

@SpringBootApplication
@EnableJpaAuditing
@SecurityScheme(
		name = "keycloak",
		type = SecuritySchemeType.OAUTH2,
		bearerFormat = "JWT",
		scheme = "bearer",
		in = SecuritySchemeIn.HEADER,
		flows = @OAuthFlows(
				password = @OAuthFlow(
						authorizationUrl = "http://localhost:9090/realms/whatsapp-clone/protocol/openid-connect/auth",
						tokenUrl = "http://localhost:9090/realms/whatsapp-clone/protocol/openid-connect/token"
				)
		)
)
public class WhatsappCloneApplication {

	public static void main(String[] args) {
		SpringApplication.run(WhatsappCloneApplication.class, args);
	}

}
