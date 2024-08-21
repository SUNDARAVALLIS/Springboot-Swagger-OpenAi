package com.tataelxsi.swagger1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@SpringBootApplication

@PropertySource("classpath:application.properties")
public class Swagger1Application {

	public static void main(String[] args) {
		SpringApplication.run(Swagger1Application.class, args);
	}
	@Bean
    public OpenAPI customOpenAPI(@Value("${application-description}") String appDescription,
            @Value("${application-version}") String appVersion) {
        return new OpenAPI()
                .info(new Info()
                        .title("Sample Application API")
                        .version(appVersion)
                        .description(appDescription)
                        .termsOfService("http://swagger.io/terms/")
                        .license(new License().name("Apache 2.0").url("http://springdoc.org")));
	}
}
