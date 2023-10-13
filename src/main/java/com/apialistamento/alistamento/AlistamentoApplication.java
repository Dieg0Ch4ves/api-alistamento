package com.apialistamento.alistamento;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Swagger OpenApi", version = "1", description = "API de alistamento"))
public class AlistamentoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlistamentoApplication.class, args);
	}

}
