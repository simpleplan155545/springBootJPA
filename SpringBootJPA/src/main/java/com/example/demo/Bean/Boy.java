package com.example.demo.Bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

//https://ithelp.ithome.com.tw/articles/10194657
@Entity
@Table(name = "BOYUSER")
public class Boy {

	/*
	 * 
	 * 在MemberAccount上方我宣告了一個@Component註解,只是要讓此類可被Controller注入
	 * 
	 * @Component
	 * 
	 * @Service
	 * 
	 * @Repository
	 * 
	 * @RestController
	 * 
	 * @Controller 這五個註解會在Spring Boot Starter一啟動後就做掃描,傳統的我們
	 */

	/*
	 * @Entity的Bean是告訴Spring這是數據模型層的宣告
	 * @Table name: Table的name對映到資料庫中的資料表名稱
	 * @Column name: 對應到Table的欄位中的欄位名稱
	 * @Id : 是此資料表的Primary Key
	 * @GeneratedValue : 告訴此Column的生成方式 ,如果設定成GenerationType.AUTO讓容器來自動產生
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="Hight")
	private String hight;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHight() {
		return hight;
	}

	public void setHight(String hight) {
		this.hight = hight;
	}

}
