package testss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Yahoo {
   WebDriver driver;
  @Test
  public void f() {
	  driver = new FirefoxDriver();
	  driver.get("http://www.yahoo.com");
	  Reporter.log("in yahoo test");
	  driver.quit();
	  
  }
}
