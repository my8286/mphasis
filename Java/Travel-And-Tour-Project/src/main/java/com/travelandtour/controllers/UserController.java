package com.travelandtour.controllers;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.travelandtour.repository.*;
import com.travelandtour.model.*;

@RestController

public class UserController {
	
	@Autowired
	UserRepository repo1;
	@Autowired
	UserAddressRepository repo2;
	
	@PostMapping("/save")
	public User saveStudent(@RequestBody User user)
	{
		repo1.save(user);
		//repo2.save(address);
		return user;
	}
	
	
	@PostMapping("/save2")
	public Address saveStudent(Address address)
	{
		repo2.save(address);
		return address;
	}	
	@RequestMapping("/data")
	public String getData()
	{
		return "{'name':'manish'}";
	}
}
