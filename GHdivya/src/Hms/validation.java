package Hms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.testng.annotations.AfterTest;

public class validation {
 public WebDriver driver;
  @Test (priority = 2)
  public void login() throws Exception {
	  driver.findElement(By.id("gh-cat")).click();
	  Thread.sleep(2000);
	  
	   String Expectedtitle ="Books";
	   String Actualtitle =driver.getTitle();
	   try {System.out.println("yes");
	   }
	  catch (Exception e) {System.out.println("no");
	  }}
  @Test (priority = 1)
  public void ram() throws InterruptedException {
	  driver.findElement(By.linkText("Electronics")).click();
	  Thread.sleep(3000);
	  
	  String Expectedtitle1 ="iphone";
	  String Actualtitle1 =driver.getTitle();
	  try {System.out.println("its visible");}
	  catch (Exception e1) {System.out.println("its not visible");
		// TODO: handle exception
	
	  
	  }
	}
  @Test (priority = 3)

  
  
  
  @BeforeTest
  public void openurl() throws Exception {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://in.ebay.com/");
   driver.manage().window().maximize();
   Thread.sleep(3000);
  }

  @AfterTest
  public void afterTest() {
  }

}
