package com.rosetown.test;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rosetown.model.User;
import com.rosetown.service.UserService;

import junit.framework.TestCase;

public class UserServiceTest extends TestCase {
	static	ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:conf/applicationContext.xml"});
	UserService userService=context.getBean(UserService.class);
	public void testCreateUser(){
		User user=new User();
		user.setUserName("zyfxgary2");
		user.setMobile("15311439451");
		user.setPassword("password@1");
		user.setRegisterDate(new Date());
		
		UserService userService=context.getBean(UserService.class);
		System.out.println(userService.create(user));
	}
	public void testCheckIsExist(){
		System.out.println("****************校验是否存在");
		System.out.println(userService.checkIsExist("zyfxgary",""));
		System.out.println(userService.checkIsExist("","15311439451"));
		System.out.println("****************校验是否存在结束");
	}
	
	public void testDelete(){
		System.out.println(userService.delete(3L));
	}
}
