package com.zikan.BankApplication;

import com.zikan.BankApplication.entity.AccountUser;
import com.zikan.BankApplication.entity.Role;
import com.zikan.BankApplication.service.AccountUserService;
import org.hibernate.query.sql.internal.ParameterRecognizerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.beans.Encoder;

@SpringBootApplication
public class BankApplication implements CommandLineRunner {
	@Autowired
	private AccountUserService accountUserService;
	@Autowired
	private PasswordEncoder passwordEncoder;


	public static void main(String[] args) {
		SpringApplication.run(BankApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		AccountUser adminUser = new AccountUser();
		adminUser.setFirstName("Admin");
		adminUser.setLastName("Admin");
		adminUser.setRole(Role.ADMIN);
		adminUser.setUsername("admin@gmail.com");
		adminUser.setPassword(passwordEncoder.encode("password"));

		AccountUser exist = accountUserService.getAccountUserByUsername("admin@gmail.com").getBody();

		if(exist == null){
			accountUserService.postAccountUser(adminUser);
		}

	}
}
