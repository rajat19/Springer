package com.paradox.geeks.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SpringFoxConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.regex("/products.*"))
                .build()
                .apiInfo(metadata());
    }

    private ApiInfo metadata() {
        Contact contact = new Contact(
                "Rajat Srivastava",
                "https://rajat19.github.io",
                "rajatsri94@gmail.com"
        );

        return new ApiInfoBuilder()
                .title("Springer Documentation")
                .description("Documentation for Springer App")
                .version("0.0.1")
                .contact(contact)
                .license("Apache 2.0")
                .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0")
                .build();
    }
}
