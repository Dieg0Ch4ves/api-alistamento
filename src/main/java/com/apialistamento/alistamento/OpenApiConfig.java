package com.apialistamento.alistamento;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Api de alistamento")
                        .description("API para fazer alistamentos com base na idade")
                        .contact(new Contact().name("Diego Chaves").email("diegoaraujo200570@gmail.com"))
                        .version("1.0.0"));
    }
}
