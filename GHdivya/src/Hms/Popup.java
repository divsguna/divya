package Hms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Popup {
	public WebDriver driver;
  
	@Test
  public void login() throws Exception {
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("password")).sendKeys("admin");
	  driver.findElement(By.name("submit")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.linkText("Feedback")).click();
	  
	  String parent=driver.getWindowHandle();
	  
	  for(String child:driver.getWindowHandles()){
	  driver.switchTo().window(child);
	  }
	  
	  driver.findElement(By.id("name")).sendKeys("kranthi");
	  driver.findElement(By.id("email")).sendKeys("divyaguna0021@gmail.com");
	  new Select(driver.findElement(By.id("car"))).selectByVisibleText("Saab");
	  driver.findElement(By.name("radio")).click();
	  driver.findElement(By.xpath("/html/body/div[2]/div/div/form/ul/li[5]/label/input")).click();
	  driver.findElement(By.xpath("/html/body/div[2]/div/div/form/ul/li[6]/input")).sendKeys("C:\\Users\\admin\\Pictures\\divya.jpg");
	  driver.findElement(By.id("message")).sendKeys("hai");
	  driver.findElement(By.xpath("/html/body/div[2]/div/div/form/p/button[1]")).click();
	  driver.findElement(By.id("close")).click();
	  
	  
	  
	  driver.switchTo().window(parent);
	  driver.findElement(By.xpath("//*[@id=\"navigation\"]/li[1]/a")).click();
	
	}
  @BeforeTest
  public void openurl() {
  System.setProperty("webdriver.chrome.driver", "C:\\HMSworkspace\\Software\\chromedriver.exe");
  driver=new ChromeDriver();
  driver.get("http://www.computechis.com/DemoSite");
		  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
