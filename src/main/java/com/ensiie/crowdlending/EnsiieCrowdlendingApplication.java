package com.ensiie.crowdlending;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ensiie.crowdlending.entities.Admin;
import com.ensiie.crowdlending.repositories.AdminRepository;

@SpringBootApplication
public class EnsiieCrowdlendingApplication implements CommandLineRunner {
	
	@Autowired
	private AdminRepository adminRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(EnsiieCrowdlendingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		if (adminRepository.findAll().size() == 0) {
			Admin admin = new Admin("root", "root", "root", "root", "000000000", "root@crowdlending.com");
			adminRepository.save(admin);
		}
	}
	

}
