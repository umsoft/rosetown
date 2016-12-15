package com.rosetown.test;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rosetown.model.User;
import com.rosetown.model.UserDetails;
import com.rosetown.service.RegisterService;
import junit.framework.TestCase;
/**
 * 注册服务测试
 * @author lisl
 *
 */
public class RegisterServiceTest extends TestCase{
	static	ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:conf/applicationContext.xml"});
	RegisterService registerService=context.getBean(RegisterService.class);
	public void testRegister(){
		User user=new User();
		user.setUserName("zyfxgary3");
		user.setMobile("1501181974");
		user.setPassword("password@1");
		user.setRegisterDate(new Date());
		
		UserDetails userDetails=new UserDetails();
		userDetails.setMobile(user.getMobile());
		userDetails.setIsActivity(false);
		userDetails.setLastModify(new Date());
		userDetails.setParentId(4L);
		System.out.println(registerService.registe(user, userDetails));
	}
	
	public void testSendVerification(){
		System.out.println(registerService.sendVerification("1501181972"));
	}
}
