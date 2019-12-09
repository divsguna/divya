package Hms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Relativexpath {
 public WebDriver driver;
	

  @Test
  public void login() {
  driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin");
  driver.findElement(By.xpath("//input[@name='submit']")).click();
  driver.findElement(By.xpath("//*[@id=\"navigation\"]/li[1]/a")).click();
  
  
  
	  
	  
  }
  @BeforeTest
  public void openurl() {

	  System.setProperty("webdriver.chrome.driver","C:\\HMSworkspace\\Software\\chromedriver.exe");
      driver=new ChromeDriver();
      driver.get("http://www.computechis.com/DemoSite");
}
  

  @AfterTest
  public void afterTest() {
  }

}
