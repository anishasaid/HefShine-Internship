package com.jpa.test.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.test.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	public List<User> findByName(String name);
	public List<User> findByNameAndCity(String name, String city);
	public List<User> findByCityStartingWith(String prefix);
}
