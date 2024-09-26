package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.MemberData;
import com.example.demo.repository.MemberDataDao;

@Controller("/")
public class HomeController {

	@Autowired
	MemberDataDao memberDataDao;
	
	@GetMapping("home")
	public String homePage() {
		System.out.println("home method.");
		MemberData data = new MemberData();
		data.setPassword("new password");
		//memberDataDao.save(data);
		return "home";
	}
}
