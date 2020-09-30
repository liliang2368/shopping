package com.ly.shopping;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ly.shopping.dao")
public class OrderShoppingApplication {
	public static void main(String[] args) {
		SpringApplication.run(OrderShoppingApplication.class, args);
	}
}
