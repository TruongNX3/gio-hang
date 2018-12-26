package com.codegym.demosellphone;

import com.codegym.demosellphone.service.ProductService;
import com.codegym.demosellphone.service.impl.ProductServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoSellPhoneApplication {
	@Bean
	public ProductService productService() {
		return new ProductServiceImpl();
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoSellPhoneApplication.class, args);
	}

}

