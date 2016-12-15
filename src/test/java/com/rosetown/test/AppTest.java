package com.rosetown.test;

import com.rosetown.utils.RandomBirthVerificationCode;
import com.rosetown.utils.StringEncryptionAndEncryptionUtil;

import junit.framework.TestCase;

public class AppTest extends TestCase{
	public void test(){
		System.out.println(RandomBirthVerificationCode.birth(6));
		System.out.println(RandomBirthVerificationCode.birth(6));
		String string=StringEncryptionAndEncryptionUtil.decrypt("~ahaag82k3gphka");
		String string2=StringEncryptionAndEncryptionUtil.decrypt("~a021haagkgphka");
		System.out.println(string);
		System.out.println(string2);
		System.out.println(string.equals(string2));
	}
}
