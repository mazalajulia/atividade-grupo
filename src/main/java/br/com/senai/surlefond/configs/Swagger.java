package br.com.senai.surlefond.configs;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "vansazul",
        version = "1.0",
        description = "E-mail para contato: vans@gmail.com"
    )
)
public class Swagger {

}
