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
import org.springframework.web.server.ResponseStatusException;

import com.travelandtour.repository.*;
import com.travelandtour.model.*;
import com.travelandtour.message.*;
@RestController
@RequestMapping("/user")
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
	@PostMapping("/login")
	public ResponseEntity<?> saveStudent(@RequestBody Login login)
	{
		
		ResponseEntity<String> resp =null;
			User user=repo1.findByEmailAndPassword(login.getEmail(), login.getPassword());
			if(user!=null)
			{
				resp=new ResponseEntity<String>("Login successful"+login.getEmail(), HttpStatus.OK);
			}
			else {
				
				resp=new ResponseEntity<String>("fail",HttpStatus.BAD_REQUEST);
			}
        
		return resp;
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
				
				
				resp = new ResponseEntity<String>(
						"Student '"+id+"' Updated", 
						//HttpStatus.RESET_CONTENT
						HttpStatus.OK
						);
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
	
	@DeleteMapping("/remove/{id}")
	public ResponseEntity<String> removeStudent(@PathVariable Long id)
	{
		ResponseEntity<String> resp = null;
		try {
			boolean exist = repo2.existsById(id);
			if(exist) {
				repo2.deleteById(id);
				resp = new ResponseEntity<String>(
						"Student '"+id+"' deleted",
						HttpStatus.OK);
			} else {
				
				resp = new ResponseEntity<String>(
						"Student '"+id+"' not exist",
						HttpStatus.BAD_REQUEST);
			}
		} catch (Exception e) {
			
			resp = new ResponseEntity<String>(
					"Unable to delete", 
					HttpStatus.INTERNAL_SERVER_ERROR);
			e.printStackTrace();
		}

		return resp;
	}
	
	@GetMapping("/all")
	public ResponseEntity<?> getAllStudents() {
		
		ResponseEntity<?> resp = null ;
		try {

			List<Address> list = repo2.findAll();
			if(list!=null && !list.isEmpty()) {
				
				list.sort((s1,s2)->s1.getStreet().compareTo(s2.getStreet()));
				/* JDK 1.8
				list = list.stream()
						.sorted((s1,s2)->s1.getName().compareTo(s2.getName()))
						.collect(Collectors.toList());
				 */
				resp = new ResponseEntity<List<Address>>(list, HttpStatus.OK);
			} else {
				

				//resp = new ResponseEntity<>(HttpStatus.NO_CONTENT);
				resp = new ResponseEntity<String>(
						"No Students Found",
						HttpStatus.OK);
			}
		} catch (Exception e) {
			

			resp =  new ResponseEntity<String>(
					"Unable to Fetch Students", 
					HttpStatus.INTERNAL_SERVER_ERROR); //500
			e.printStackTrace();
		}
		
		return resp;
	}
	@GetMapping("/one/{id}")
	public Optional<User> getOneStudent(@PathVariable Long id) 
	{
	
			Optional<User> opt =  repo1.findById(id);
			//if(opt.isPresent()) 
				//resp = new ResponseEntity<User>(opt.get(), HttpStatus.OK);
			
		return opt;
	}



}
