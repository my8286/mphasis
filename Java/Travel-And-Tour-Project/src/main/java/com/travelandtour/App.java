package com.travelandtour;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.travelandtour.repository.*;

@SpringBootApplication
public class App{
	@Autowired
	UserRepository ud;
	@Autowired
	UserAddressRepository udr;
	

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}
