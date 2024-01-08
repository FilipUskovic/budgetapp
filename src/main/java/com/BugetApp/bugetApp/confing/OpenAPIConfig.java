package com.BugetApp.bugetApp.confing;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;

@Configuration
public class OpenAPIConfig {

    @Value("${homebuget.openapi.dev-url}")
    private String devUrl;


    @Bean
    public OpenAPI myOpenAPi(){
       Server server = new Server();
       server.setUrl(devUrl);
       server.setDescription("Server razvoj homeBuget app");

        Contact contact = new Contact();
        contact.setEmail("filip.uskovic@outlook.com");
        contact.setName("Filip_Uskovic");

        License license = new License().name("MIT License").url("https://choosealicense.com/licenses/mit/");

        Info info = new Info()
        .title("Home Buget App API")
                .version("1.0")
                .contact(contact)
                .description("This API exposes endpoints to manage tutorials.")
                .license(license);

        return new OpenAPI().info(info).servers(List.of(server));

   }
}
