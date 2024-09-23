package com.returnorder.authorization.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.returnorder.authorization.model.MyUser;

public interface UserRepository extends JpaRepository<MyUser,String > {

	public MyUser findByUsername(String username);

	

}
