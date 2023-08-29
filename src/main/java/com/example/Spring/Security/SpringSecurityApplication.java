package com.example.Spring.Security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
@SpringBootApplication
public class SpringSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityApplication.class, args);
// // it will generate the new Hash password 10 time
//		PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//
//		for (int i = 1; i <= 10; i++) {
//
//			String authenticatedPassword = passwordEncoder.encode("pass");
//			System.out.println("The Password is : " + authenticatedPassword);
//		}
	}
}
