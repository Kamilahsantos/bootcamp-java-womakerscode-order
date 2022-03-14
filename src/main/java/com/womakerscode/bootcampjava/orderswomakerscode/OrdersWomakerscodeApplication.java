package com.womakerscode.bootcampjava.orderswomakerscode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OrdersWomakerscodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrdersWomakerscodeApplication.class, args);
	}

}
