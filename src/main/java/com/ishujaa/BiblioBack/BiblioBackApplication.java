package com.ishujaa.BiblioBack;

import com.ishujaa.BiblioBack.model.BookEntity;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.logging.ConsoleHandler;

@SpringBootApplication
public class BiblioBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(BiblioBackApplication.class, args);
	}
}
