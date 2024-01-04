package com.Answer.QustionAnswer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class QustionAnswerApplication {

	public static void main(String[] args) {
		SpringApplication.run(QustionAnswerApplication.class, args);
	}

}
