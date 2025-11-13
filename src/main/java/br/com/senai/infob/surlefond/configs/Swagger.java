package br.com.senai.infob.surlefond.configs;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "Sur Le Fond",
        version = "1.0",
        description = "Ana Clara, Gabrielle, Giovana Baltar, Julia Mazala e Maria Alice"
    )
)
public class Swagger {

}