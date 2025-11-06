package com.lepique.api_rest_echo;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiRestEchoApplication {

    public static void main(String[] args) {


        // Esto sirve para cargar las variables del .env del sistema
        Dotenv dotenv = Dotenv.configure().ignoreIfMissing().load();
        dotenv.entries().forEach( entry ->
                System.setProperty(entry.getKey(), entry.getValue() )
        );

        SpringApplication.run(ApiRestEchoApplication.class, args);
    }

}
