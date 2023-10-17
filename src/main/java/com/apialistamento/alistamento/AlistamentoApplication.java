package com.apialistamento.alistamento;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Swagger OpenApi", version = "1", description = "API de alistamento"),
		servers = { @Server(url = "/" , description = "Default Server URL")})
public class AlistamentoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlistamentoApplication.class, args);
	}

}
