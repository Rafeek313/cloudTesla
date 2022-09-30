package cloudtesla.crm.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
@FindBy(xpath="//a[.='Sign Up']")
private WebElement signUpBtn;
@FindBy(xpath="//a[.='Sign In']")
private WebElement signInBtn;
public  HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
public WebElement getSignupbtn() {
	return signUpBtn;
}
public WebElement getSiginbtn() {
	return signInBtn;
}
public void signupLink() {
	signUpBtn.click();
}
public void signinLink() {
	signInBtn.click();
}
}
