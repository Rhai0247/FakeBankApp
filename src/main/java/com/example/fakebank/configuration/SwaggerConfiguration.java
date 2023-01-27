package com.example.fakebank.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

    private static String getApiDescription() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("This API allows: \n");
        stringBuilder.append("to create a new bank account for a customer, with an initial deposit amount; \n");
        stringBuilder.append("Transfer amounts between any two accounts; \n");
        stringBuilder.append("Retrieve balances for a given account; \n");
        stringBuilder.append("Retrieve transfer history for a given account.");
        return stringBuilder.toString();
    }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }
}