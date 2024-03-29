package com.wdxxl.cloud.eureka.client;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@EnableDiscoveryClient
public class SayHelloApplication {

	private static Logger log = LoggerFactory.getLogger(SayHelloApplication.class);

	@Value("${server.port}")
	String serverPort;

    @Value("${server.address}")
	String serverAddress;

	@RequestMapping(value = "/greeting")
	public String greet(){
		log.info("Access /greeting");
		List<String> greetings = Arrays.asList("Hi There", "FlatironsSolutions", "Let's do something funny.");
		Random rand = new Random();
		int randomNum = rand.nextInt(greetings.size());
		return serverPort + " : " + greetings.get(randomNum);
	}

	@RequestMapping(value = "/")
	public String home(){
		log.info("Access /");
		return "Hi...";
	}

	public static void main(String[] args){
		SpringApplication.run(SayHelloApplication.class, args);
	}
}
