package Hms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class KFC {
	public WebDriver driver;
		
	}
  @Test
  public void login() {
	  
	  
	  
  }
  @BeforeTest
  public void openurl() {
 System.setProperty("webdriver.chrome.driver","C:\\HMSworkspace\\Software\\chromedriver.exe");
 driver=new ChromeDriver();
  driver.get("https://online.kfc.co.in");
      
     
      
      
      
}
  }
  
  
  

  @AfterTest
  public void afterTest() {
  }

}
