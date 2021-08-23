package com.travelandtour.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travelandtour.repository.UserRepository;
import com.travelandtour.model.*;


@Service
public class UserService {
	@Autowired
	UserRepository repo;
	public User saveUser(User user)
	{
		return repo.save(user);
	}
	
	public User fetchUserByEmailId(String email)
	{
		return repo.findByEmail(email);
	}
	
	public User fetchUserByPhoneno(String phoneno)
	{
		return repo.findByPhoneno(phoneno);
	}
	
	public User fetchUserByEmailAndPassword(String email,String password)
	{
		return repo.findByEmailAndPassword(email,password);
	}

}
