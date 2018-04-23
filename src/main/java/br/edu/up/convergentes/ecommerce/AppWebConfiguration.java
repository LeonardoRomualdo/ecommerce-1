package br.edu.up.convergentes.ecommerce;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "br.edu.up.convergentes")
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class AppWebConfiguration {
}