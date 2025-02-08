package testBase;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public static WebDriver driver;
	public Properties prop;
	@BeforeClass
	
	public void setup() throws IOException   {
		FileInputStream fis=new FileInputStream("./src/test/resources/Config.Properties");
		 prop=new Properties();
		prop.load(fis);
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(prop.getProperty("URL"));
		
	}
	@AfterClass
	public void teardown() {
		driver.quit();
	}

}
