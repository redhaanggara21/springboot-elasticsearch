package com.red21.springlogelk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SpringBootApplication
@EnableElasticsearchRepositories(
	basePackages = "com.red21.springlogelk.entity.Product" 
)

@ComponentScan(
	basePackages = { "com.red21.springlogelk.entity.Product" }
)

@Configuration
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})

public class SpringLogElkApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringLogElkApplication.class, args);
	}

}
