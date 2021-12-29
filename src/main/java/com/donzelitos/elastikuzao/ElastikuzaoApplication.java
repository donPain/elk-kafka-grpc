package com.donzelitos.elastikuzao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class ElastikuzaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElastikuzaoApplication.class, args);
	}

}
