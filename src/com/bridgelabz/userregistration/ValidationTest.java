package com.bridgelabz.userregistration;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class ValidationTest {
	private Validation v ;
	private String f_name;
	private String l_name;
	private String number;
	private String password;
	private String email;
	@Before
	public void setUp()
	{
		v = new Validation();
		f_name = "Avani";
		l_name = "Trivedi";
		number = "9516044147";
		password= "Avani@1234";
		email= "abc100@gmail.com";
	}
	//For the first name and last name
	@Test
	public void nameValidation()
	{
		//Happy case for first name
		boolean ans1 = v.nameValidation(f_name);
		Assert.assertEquals(true, ans1);
		//Sad case for first Name
		f_name = "Av";
		boolean ans2 = v.nameValidation(f_name);
		Assert.assertEquals(false, ans2);
		//Happy case for last name
		l_name = "Trivedi";
		boolean ans3 = v.nameValidation(l_name);
		Assert.assertEquals(true, ans3);
		//Sad case for last name
		l_name = "Tr";
		boolean ans4 = v.nameValidation(l_name);
		Assert.assertEquals(false, ans4);
	}
	
	@Test
	public void emailValidation()
	{
		//Happy case for email validation
		boolean ans1 = v.emailValidation(email);
		Assert.assertEquals(true,ans1);
		//Sad case for email validation
		email = "abc()*@gmail.com";
		boolean ans2 = v.emailValidation(email);
		Assert.assertEquals(false, ans2);
		
		}
	@Test
	public void phoneNumberValidation()
	{
		//Happy case for phone number validation
		boolean ans = v.phoneNumberValidation(number);
		Assert.assertEquals(true, ans);
		//Sad case for phone number validation
		number = "123";
		boolean ans1 = v.phoneNumberValidation(number);
		Assert.assertEquals(false, ans1);
		
	}
	@Test
	public void passwordValidation()
	{
		//Happy case for password validation
		boolean ans1 = v.passwordValidation(password);
		Assert.assertEquals(true, ans1);
		//Sad case for password validation
		password = "Avani";
		boolean ans2 = v.passwordValidation(password);
		Assert.assertEquals(false, ans2);
	}
}
