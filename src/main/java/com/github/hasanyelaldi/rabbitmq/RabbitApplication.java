package com.github.hasanyelaldi.rabbitmq;

import com.github.fabiomaffioletti.firebase.EnableFirebaseRepositories;
import com.github.fabiomaffioletti.firebase.FirebaseConfigurationProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableFirebaseRepositories
public class RabbitApplication {

    public static void main(String[] args) {
        SpringApplication.run(RabbitApplication.class, args);
    }
}

