package com.cloudtesla.LoginTests;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import cloudtesla.crm.GenericLibrary.BaseClass;
import cloudtesla.crm.ObjectRepository.HomePage;
import cloudtesla.crm.ObjectRepository.LoginPage;

public class LoginPageTests extends BaseClass{
@Test
public void loginPageTests() throws IOException, Throwable {
	wlib.waitForPageLoad(driver);
	String username = elib.readDataFromExcel("SignUp", 1, 3);
	String password = elib.readDataFromExcel("SignUp", 1, 4);
	HomePage homepage=new HomePage(driver);
	homepage.signinLink();
	LoginPage loginpage=new LoginPage(driver);
	loginpage.usernametbx(username);
	loginpage.passwordtbx(password);
	loginpage.loginbtn();
	Reporter.log("signin success full",true);
}
}
