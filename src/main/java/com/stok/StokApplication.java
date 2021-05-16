package com.stok;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@EnableWebSecurity
@SpringBootApplication
public class StokApplication {   // Uygulamayı çalıştıran sınıf

	public static void main(String[] args) {
		SpringApplication.run(StokApplication.class, args);
	}

}
