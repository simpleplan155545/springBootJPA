package com.example.demo.UserDao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Bean.Boy;

//使用繼承JpaRepository成功,使用繼承JpaRepository就不用實作UserDaoImpl
//public interface UserDao extends JpaRepository<Boy, Long>{
	public interface UserDao{
	List<Boy> findAll();
	
	List<Boy> findByName(String name);
}
