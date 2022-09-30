package cloudtesla.crm.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
@FindBy(id="firstName")
private WebElement firstNameTbx;
@FindBy(id="lastName")
private WebElement clientIdTbx;
@FindBy(id="email")
private WebElement emailTbx;
@FindBy(id="username")
private WebElement userNameTbx;
@FindBy(id="password")
private WebElement passwordTbx;
@FindBy(xpath="//button[.='Sign up']")
private WebElement signupbtn;
public SignUpPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public WebElement getFirstNameTbx() {
	return firstNameTbx;
}
public WebElement getClientIdTbx() {
	return clientIdTbx;
}
public WebElement getEmailTbx() {
	return emailTbx;
}

public WebElement getUserNameTbx() {
	return userNameTbx;
}
public WebElement getPasswordTbx() {
	return passwordTbx;
}
public WebElement getSignupbtn() {
	return signupbtn;
}
public void firstnametbx(String fn) {
	firstNameTbx.sendKeys(fn);
	firstNameTbx.click();
}
public void clientidtbx(String ci) {
	clientIdTbx.sendKeys(ci);
	clientIdTbx.click();
}
public void emailtbx(String em) {
	emailTbx.sendKeys(em);
	emailTbx.click();
}
public void usernametbx(String un) {
	userNameTbx.sendKeys(un);
	userNameTbx.click();
}
public void passwordtbx(String pwd) {
	passwordTbx.sendKeys(pwd);
	passwordTbx.click();
}
public void signupbtn() {
	signupbtn.click();
}
}
