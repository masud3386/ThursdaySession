package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage extends Base{

	public Loginpage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//input[@name='username']")
	WebElement usernametext;
	public void username(String uname) {
		usernametext.sendKeys(uname);
	}
	
	
	@FindBy(xpath="//input[@name='password']")
	WebElement passwordtext;
	public void password(String pwd) {
		passwordtext.sendKeys(pwd);
	}
	
	
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginbutton;
	public void loginoption() {
		loginbutton.click();
	}
	
	
	
	
	
	
	
	
	

}
