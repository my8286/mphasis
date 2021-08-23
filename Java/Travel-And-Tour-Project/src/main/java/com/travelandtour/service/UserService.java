package com.travelandtour.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travelandtour.repository.ContactRepository;
import com.travelandtour.repository.UserRepository;
import com.travelandtour.model.*;


@Service
public class UserService {
	@Autowired
	UserRepository user_repo;
	
	@Autowired
	ContactRepository contact_repo;
	
	public User saveUser(User user)
	{
		return user_repo.save(user);
	}
	
	public User fetchUserByEmailId(String email)
	{
		return user_repo.findByEmail(email);
	}
	
	public User fetchUserByPhoneno(String phoneno)
	{
		return user_repo.findByPhoneno(phoneno);
	}
	
	public User fetchUserByEmailAndPassword(String email,String password)
	{
		return user_repo.findByEmailAndPassword(email,password);
	}
	public Contact saveContactUs(Contact contact)
	{
		return contact_repo.save(contact);
	}

}
