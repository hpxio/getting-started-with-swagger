package com.app.rc.getting_started_with_swagger.config.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@EnableSwagger2
@Configuration
public class SwaggerRunnerConfig {

    /**
     * API Information - Basic Swagger Configurations
     * @return ApiInfo Object containing config info for Swagger
     */
    @Bean
    public Docket apiInfo() {
        return new
                Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.app.rc.getting_started_with_swagger.ui.controller"))
                .paths(PathSelectors.regex("/rest.*"))
                .build()
                .apiInfo(metaInfo());
    }

    /**
     * Metadata - Details about the Controllers and project owner
     * @return ApiInfo Object containing owner and end-points meta details
     */
    private ApiInfo metaInfo() {
        return new ApiInfo(
                "Getting Started With Swagger",
                "Swagger with Spring Boot Application",
                "0.0.0.1",
                "",
                new Contact(
                        "iHSPA",
                        "https://github.com/iHSPA",
                        "harrsh.hp@live.in"),
                "MIT License",
                "https://gist.github.com/iHSPA/418f1a0c5c06dd42610662e8fd0409ac",
                new ArrayList<>());
    }
}