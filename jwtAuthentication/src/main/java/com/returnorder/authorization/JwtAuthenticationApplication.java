package com.returnorder.authorization;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.returnorder.authorization.Repository.UserRepository;
import com.returnorder.authorization.model.MyUser;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@SpringBootApplication
public class JwtAuthenticationApplication {

	static Logger logger = LoggerFactory.getLogger(JwtAuthenticationApplication.class);

	@Autowired
	private UserRepository repository;

//	@PostConstruct
//	public void initUsers() {
//		List<MyUser> users = Stream.of(new MyUser("1", "Raj", "Raj"), new MyUser("2", "Rachana", "Rachana"),
//				new MyUser("3", "Sanket", "Sanket"), new MyUser("4", "Pradnya", "Pradnya"),
//				new MyUser("5", "Surabhi", "Surabhi")).collect(Collectors.toList());
//		repository.saveAll(users);
//	}

	public static void main(String[] args) {
		SpringApplication.run(JwtAuthenticationApplication.class, args);
		logger.info("Authentication module started successfully");
	}

}
