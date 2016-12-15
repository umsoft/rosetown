package com.rosetown.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rosetown.service.UserDetailsService;

import junit.framework.TestCase;

/**
 * 用户详细信息测试类
 * @author gary
 *
 */
public class UserDetailsServiceTest extends TestCase{
	static	ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:conf/applicationContext.xml"});
	UserDetailsService userDetailsService=context.getBean(UserDetailsService.class);
	
	public void testActivetedUser(){
		System.out.println(userDetailsService.activatedUser(3L));
	}
	
}
