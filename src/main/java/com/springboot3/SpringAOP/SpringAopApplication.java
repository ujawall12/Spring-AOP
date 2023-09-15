package com.springboot3.SpringAOP;

import com.springboot3.SpringAOP.AOPService.BusinessService1;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@RequiredArgsConstructor
public class SpringAopApplication implements CommandLineRunner {

	private final Logger logger= LoggerFactory.getLogger(getClass());

	private final BusinessService1 businessService1;

//	public SpringAopApplication(BusinessService1 businessService1){
//		this.businessService1=businessService1;
//	}

	public static void main(String[] args) {
		SpringApplication.run(SpringAopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Value returned is {}", businessService1.calculateMax());

	}
}
