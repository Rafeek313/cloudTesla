package com.cloudtesla.LoginTests;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import cloudtesla.crm.GenericLibrary.BaseClass;
import cloudtesla.crm.ObjectRepository.HomePage;
import cloudtesla.crm.ObjectRepository.SignUpPage;


public class SignUpPageTest extends BaseClass {
	@Test
	public void signuppageTest() throws IOException, Throwable {
		wlib.waitForPageLoad(driver);
		String firstname = elib.readDataFromExcel("SignUp", 4, 0);
		String clientid = elib.readDataFromExcel("SignUp", 4, 1);
		String email = elib.readDataFromExcel("SignUp", 4, 2);
		String username = elib.readDataFromExcel("SignUp", 4, 3);
		String password = elib.readDataFromExcel("SignUp", 4, 4);
		HomePage homepage=new HomePage(driver);
		homepage.signupLink();
		SignUpPage signup=new SignUpPage(driver);
		signup.firstnametbx(firstname);
		signup.clientidtbx(clientid);
		signup.emailtbx(email);
		signup.usernametbx(username);
		signup.passwordtbx(password);
		signup.signupbtn();
		Reporter.log("sign up successful",true);
	}
	

}
