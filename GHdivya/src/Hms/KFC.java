package Hms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class KFC {
	public WebDriver driver ;
		
	
  @Test(priority=1)
  public void signin() throws Exception {
 driver.findElement(By.xpath("//*[@id=\"primary-header\"]/div[2]/div/div/div[2]/div/div[3]/a")).click();
 Thread.sleep(2000);
 driver.findElement(By.id("Email")).sendKeys("rammidrums@gmail.com");
 Thread.sleep(3000);
 driver.findElement(By.id("Password")).sendKeys("rami@143");
 Thread.sleep(2000);
 driver.findElement(By.xpath("//*[@id=\"RenderBodyDiv\"]/div/div/div[2]/div[1]/div/div/div/div/form/div/div[3]/button")).click();
 Thread.sleep(2000);
  }
  @Test(priority=2)
  public void Select() throws Exception {
	driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[2]/a")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"RenderBodyDiv\"]/div/div/div[2]/div/div/div[2]/div/div/div/div[3]/ul/li[1]/div/div/div/picture/img")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"menu_cat_outerwrapper\"]/div/div[3]/div/div/ul/li[2]/div/div/div/div[2]/div/button")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("geocomplete")).sendKeys("Bangalore, Karnataka, India");
	Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"start_myOrder_outerDiv\"]/button/span")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("cartCounterUpdate")).click();
	  Thread.sleep(2000);
  }
  @Test(priority=3)
  public void payment() throws Exception {
  driver.findElement(By.linkText("PROCEED TO PAYMENT")).click();  
  Thread.sleep(2000);
  driver.findElement(By.id("txtCity")).sendKeys("4-112/flat no.5");
  Thread.sleep(2000);
  driver.findElement(By.id("txtTitle")).sendKeys("gandhi nagar");
  Thread.sleep(2000);
  driver.findElement(By.xpath("//*[@id=\"checkoutForm\"]/div/div[4]/div/ul/li[3]/a")).click();
  Thread.sleep(2000);
  driver.findElement(By.id("myAccountSubmit")).click();
  Thread.sleep(2000);
  }
  
  
  
  @BeforeTest
  public void openurl() throws Exception {
	  System.setProperty("webdriver.chrome.driver","C:\\HMSworkspace\\Software\\chromedriver.exe");
      driver=new ChromeDriver();
      driver.get("https://online.kfc.co.in");
      driver.manage().window().maximize();
      Thread.sleep(3000);
      
}
	  
  
  

  @AfterTest
  public void afterTest() {
  }

}
