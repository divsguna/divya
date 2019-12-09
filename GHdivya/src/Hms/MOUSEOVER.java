package Hms;

import org.testng.annotations.Test;

import com.google.common.net.PercentEscaper;

import org.testng.annotations.BeforeTest;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;
import org.testng.annotations.AfterTest;

public class MOUSEOVER{
	public WebDriver driver;
	public Actions action;
	
  @Test
  public void login() throws Exception {
	  
	  action = new Actions(driver);
	  
	  //Electronics
	  WebElement electronics=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/ul/li[1]/span"));
	  action.moveToElement(electronics).build().perform();
	  
	  Thread.sleep(2000);
	  
	  driver.findElement(By.linkText("Mi")).click();
	  
	  
	  Thread.sleep(4000);
	  WebElement tvsandappliances=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/ul/li[2]/span"));
	  action.moveToElement(tvsandappliances).build().perform();
	  
	  Thread.sleep(3000);
	  
	  WebElement men=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/ul/li[3]/span"));
	  action.moveToElement(men).build().perform();
	  
	  Thread.sleep(5000);
	  WebElement women=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/ul/li[4]/ul/li/ul/li[2]/ul"));
	  action.moveToElement(women).build().perform();
	  
	  Thread.sleep(3000);
	  WebElement babyandkids=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/ul/li[5]/span"));
	  action.moveToElement(babyandkids).build().perform();
	  
	  WebElement homeandfurniture=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/ul/li[6]/span"));
	  action.moveToElement(homeandfurniture).build().perform();
	  
	  WebElement sportsbooksandmore=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/ul/li[7]/span"));
	  action.moveToElement(sportsbooksandmore).build().perform();
	  
	  WebElement offerzone=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/ul/li[8]/a/span"));
	  action.moveToElement(offerzone).build().perform(); 
  }
	  
	  
	  
	  
	  
	  
//	  
//  driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("divyaguna0021@gmail.com");
//  driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("8985988525");
//  driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")).click();
//  driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("9393895539"); 
//  
//  }
  @BeforeTest
  public void openurl() {
  System.setProperty("webdriver.chrome.driver", "C:\\HMSworkspace\\Software\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	
	//Loginwindowclose
	driver.findElement(By.xpath("//button(@class=_2AkmmA _29YdH8")).click();
	
			
  }

  @AfterTest
  public void afterTest() {
  }

}
