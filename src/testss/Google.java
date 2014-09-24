package testss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Google {
	WebDriver driver;
  @Test
  public void f() {
	  //modified by hardik
	  //Reporter.log("checking Gmail test");
	  
	  driver = new FirefoxDriver();
	  driver.get("http://www.gmail.com");
	  Reporter.log("in gmail test");
	  driver.quit();
	  
  }
}
