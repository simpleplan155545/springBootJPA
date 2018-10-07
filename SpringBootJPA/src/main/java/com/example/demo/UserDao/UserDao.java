package com.example.demo.UserDao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Bean.Boy;

public interface UserDao extends JpaRepository<Boy, Long>{
	List<Boy> findAll();
	
	List<Boy> findByName(String name);
}
