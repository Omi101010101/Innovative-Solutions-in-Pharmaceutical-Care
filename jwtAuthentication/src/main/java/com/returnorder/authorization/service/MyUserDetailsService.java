package com.returnorder.authorization.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.returnorder.authorization.Repository.UserRepository;
import com.returnorder.authorization.model.MyUser;



@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		MyUser cusUser =  userRepository.findByUsername(username);
//		return new User(cusUser.getUsername(),cusUser.getPassword(),new ArrayList<>());
//	}

	@Override
	public UserDetails loadUserByUsername(String username) {
		try
		{
			MyUser custuser = userRepository.findById(username).orElse(null);
			if(custuser == null) {
				//custuser.getUsername();
				return new User("badUser","pass",new ArrayList<>());
			}
			return new User(custuser.getUsername(), custuser.getPassword(), new ArrayList<>());
		}
		catch (Exception e) {
			throw new UsernameNotFoundException("UsernameNotFoundException");
		}
	}
}
