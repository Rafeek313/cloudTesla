package cloudtesla.crm.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="usernameOrEmail")
	private WebElement usernameTbx;
	@FindBy(id="password")
	private WebElement passwordTbx;
	@FindBy(xpath="//button[.='Sign in']")
	private WebElement loginbtn;
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getUsernameTbx() {
		return usernameTbx;
	}
	public WebElement getPasswordTbx() {
		return passwordTbx;
	}
 public void usernametbx(String un) {
	 usernameTbx.sendKeys(un);
	 usernameTbx.click();
 }
 public void passwordtbx(String pwd) {
	 passwordTbx.sendKeys(pwd);
	 passwordTbx.click();
 }
 public void loginbtn() {
	 loginbtn.click();
 }
 
}
