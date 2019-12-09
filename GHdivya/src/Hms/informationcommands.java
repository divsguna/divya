package Hms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class informationcommands {
	public WebDriver driver;
	
  @Test
  public void login() {
	 // driver.findElement(By.id("identifierId")).sendKeys("divyaguna0021@gmail.com");
	  // driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span")).click();
	  //driver.findElement(By.name("password")).sendKeys("9492653677");
	  String str= driver.findElement(By.linkText("Gmail")).getText();
		 System.out.println(str);
	String str1= driver.findElement(By.id("hplogo")).getAttribute("alt");
	System.out.println(str1);
	 String str2 =driver.findElement(By.name("btnI")).getAttribute("value");
	 System.out.println(str2);
	String str3= driver.findElement(By.linkText("Images")).getText();
	System.out.println(str3);
  }
  @BeforeTest
  public void openurl() throws Exception {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	   driver.get("https://www.google.com");
  
     
   Thread.sleep(3000);
  }

  @AfterTest
  public void afterTest() {
  }

}
