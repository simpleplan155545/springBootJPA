package com.example.demo.UserDaoImpl;



import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.Bean.Boy;
import com.example.demo.UserDao.UserDao;
import com.example.demo.Util.JPAUtil;



@Transactional
@Repository
public class UserDaoImpl implements UserDao{
	
	@PersistenceContext
	private EntityManager em;

	
	
	@Override
	public List<Boy> findAll() {
		Boy rslt = null;
//		EntityManagerFactory factory=Persistence.createEntityManagerFactory("userPersistenceUnit");
//		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
//		em = factory.createEntityManager();
		rslt = em.find(Boy.class, 1);
		System.out.println(rslt.getName());
		System.out.println(rslt.getHight());
		System.out.println(rslt.getId());
		System.out.println("OKOKOKOK");
		return null;
	}
	@Override
	public List<Boy> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
