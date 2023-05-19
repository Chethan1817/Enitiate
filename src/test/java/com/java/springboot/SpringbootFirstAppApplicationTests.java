package com.java.springboot;

import com.java.springboot.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootFirstAppApplicationTests {

	@Autowired
	UserService userService;




}
