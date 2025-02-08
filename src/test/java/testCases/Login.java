package testCases;

import org.testng.annotations.Test;

import pageObjects.Loginpage;
import testBase.BaseClass;

public class Login extends BaseClass{
	
	
	@Test
	public void verifylogin() {
		Loginpage lp=new Loginpage(driver);
		lp.username(prop.getProperty("UserName"));
		lp.password(prop.getProperty("Password"));
		lp.loginoption();
	}

}
