package com.bridgelabz.userregistrationtest;

import com.bridgelabz.userregistration.ValidationException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.bridgelabz.userregistration.Validation;
import org.junit.jupiter.api.Assertions;


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
		f_name = "avani";
		l_name = "trivedi";
		number = "95160147";
		password= "avan";
		email= "abc100@gmail";
	}
	//For the first name and last name
	@Test
	public void nameValidation() throws ValidationException
	{
		try{
			v.nameValidation(f_name);
			v.nameValidation(l_name);
		}
		catch (ValidationException e)
		{
			Assertions.assertEquals(ValidationException.ExceptionType.INVALID_NAME, e.type);
		}

	}
	
	@Test
	public void emailValidation() throws ValidationException {
		try {
			v.emailValidation(email);
		}
		catch (ValidationException e)
		{
			Assert.assertEquals(ValidationException.ExceptionType.INVALID_EMAIL, e.type);
		}
		}
	@Test
	public void phoneNumberValidation() throws ValidationException {
		try {
			v.phoneNumberValidation(number);
		} catch (ValidationException e) {
			Assert.assertEquals(ValidationException.ExceptionType.INVALID_PHONE_NUMBER, e.type);
		}
	}
	@Test
	public void passwordValidation() throws ValidationException {
		try {
			v.passwordValidation(password);
		}
		catch (ValidationException e) {
			Assert.assertEquals(ValidationException.ExceptionType.INVALID_PASSWORD, e.type);
		}
	}
}
