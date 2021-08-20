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

import in.nareshit.raghu.model.Student;

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
	public Address saveStudent(@RequestBody Address address)
	{
		repo2.save(address);
		return address;
	}	
	@PutMapping("/modify/{id}")
	public ResponseEntity<String> updateStudent(@PathVariable Long id,@RequestBody Address address)
	{
		ResponseEntity<String> resp =null;

		try {
			
			Optional<Address> opt =  repo2.findById(id);
			if(opt.isPresent()) {
				
				Address actual = opt.get();
				if(address.getStreet()!=null)
				{
					actual.setStreet(address.getStreet());
				}
				if(address.getCity()!=null)
				{
					actual.setCity(address.getCity());
				}
				if(address.getState()!=null)
				{
					actual.setState(address.getState());
				}
				
				repo2.save(actual);
				
				
			} else {
				
				resp = new ResponseEntity<String>(
						"Student '"+id+"' not found", 
						//HttpStatus.RESET_CONTENT
						HttpStatus.BAD_REQUEST
						);
			}

		} catch (Exception e) {
			resp = new ResponseEntity<String>(
					"Unable to process Update",
					HttpStatus.INTERNAL_SERVER_ERROR);
			e.printStackTrace();
		}

		return resp;
	}

}
