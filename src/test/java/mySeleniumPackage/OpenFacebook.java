package mySeleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class OpenFacebook {

@Test
public void testcase() {
	WebDriver driver;
	System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.get("https://www.facebook.com");
	System.out.println(driver.getTitle());
	driver.close();
	
	}

}
