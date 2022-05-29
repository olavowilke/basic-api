package com.crud.crudapi;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CrudApiConfig {
    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Crud API")
                        .description("Simple API for performing backend requests")
                        .version("v1"))
                .externalDocs(new ExternalDocumentation()
                        .description("Github")
                        .url("https://github.com/olavowilke/basic-api"));
    }
}
