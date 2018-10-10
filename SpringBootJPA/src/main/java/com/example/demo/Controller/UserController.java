package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Bean.Boy;
import com.example.demo.UserDao.UserDao;

@RestController
public class UserController {
	@Autowired 
	UserDao userDao;
	
	@RequestMapping(value="/boy")
    public String addMemberPage(){

		List<Boy> list= new ArrayList<Boy>();
		list = userDao.findAll();

		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i).getId());
		}
        return "addMemberPage";
    }
	
	@RequestMapping(value="/findBoy")
    public String findBoy(){

		List<Boy> list= new ArrayList<Boy>();
		list = userDao.findAll();

		for(int i=0;i<list.size();i++){
			System.out.println("ID:"+list.get(i).getId());
			System.out.println("HIGHT:"+list.get(i).getHight());
			System.out.println("NAME:"+list.get(i).getName());
			System.out.println("-------------------------------------------------------------");
		}
        return "addMemberPage";
    }
	
//	@RequestMapping(value="/insData")
//    public String insData(){
//		Boy boy=new Boy();
//		boy.setHight("180");
//		boy.setName("JAMES");
//		userDao.save(boy);
//		System.out.println("-------------------------------------------------------------");
//        return "addDataSuccess";
//    }
}
