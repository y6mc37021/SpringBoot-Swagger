package com.company.swaggeropenapi.swaggeropenapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Employees API", version = "3.0", description = "Employees Information"))
public class SwaggerOpenapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerOpenapiApplication.class, args);
	}

}
