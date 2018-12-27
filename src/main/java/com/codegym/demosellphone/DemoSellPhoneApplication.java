package com.codegym.demosellphone;

import com.codegym.demosellphone.service.OrderDetailsService;
import com.codegym.demosellphone.service.ProductService;
import com.codegym.demosellphone.service.impl.OrderDetailsServiceImpl;
import com.codegym.demosellphone.service.impl.ProductServiceImpl;
import com.codegym.demosellphone.storage.StorageProperties;
import com.codegym.demosellphone.storage.StorageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class DemoSellPhoneApplication {
	@Bean
	public ProductService productService() {
		return new ProductServiceImpl();
	}

	@Bean
	public OrderDetailsService orderDetailsService() {
		return new OrderDetailsServiceImpl();
	}

	@Bean
	CommandLineRunner init(StorageService storageService) {
		return (args) ->{storageService.init();
		};
	}


	public static void main(String[] args) {
		SpringApplication.run(DemoSellPhoneApplication.class, args);
	}

}

