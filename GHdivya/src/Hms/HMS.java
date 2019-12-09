package Hms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class HMS {
	public WebDriver driver;
  @Test(priority=1)
  public void login() throws Exception {
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("password")).sendKeys("admin");
	  driver.findElement(By.name("submit")).click();
	  Thread.sleep(3000);
  }
  @Test(priority=2)
		  public void registration() throws Exception {
		driver.findElement(By.linkText("Registration")).click();
		new Select(driver.findElement(By.name("PATIENT_CAT"))).selectByVisibleText("Pay Patient");
		new Select(driver.findElement(By.name("TITLE"))).selectByIndex(2);
	    driver.findElement(By.name("PNT_NAME")).sendKeys("kranthi");
	    driver.findElement(By.name("MIDDLE_NAME")).sendKeys("kumar");
	    driver.findElement(By.name("LAST_NAME")).sendKeys("kk");
	    driver.findElement(By.name("DOB")).sendKeys("29/5/1997");
	    driver.findElement(By.name("AGE")).sendKeys("23");
	    new Select(driver.findElement(By.name("SEX"))).selectByVisibleText("Male");
	    new Select(driver.findElement(By.name("MTRL_STATUS"))).selectByVisibleText("Single");
	    new Select(driver.findElement(By.name("RELIGION"))).selectByVisibleText("Hindu");
	    new Select(driver.findElement(By.name("PLANGUAGE"))).selectByVisibleText("Telugu");
	    new Select(driver.findElement(By.name("RELATION"))).selectByVisibleText("Brother");
	    driver.findElement(By.name("MOTHER_NAME")).sendKeys("Iraa");
	    new Select(driver.findElement(By.name("PAT_IDENTITY"))).selectByVisibleText("AAdhar Card");
	    driver.findElement(By.name("PAT_IDENTITY_PROOF")).sendKeys("976389208560");
	    new Select(driver.findElement(By.name("NATIONALITY"))).selectByValue("Indian");
	    new Select(driver.findElement(By.name("IS_MLC"))).selectByIndex(2);
	    new Select(driver.findElement(By.name("EDUCATION"))).selectByIndex(4);
	    new Select(driver.findElement(By.name("OCCUPATION"))).selectByIndex(2);
	    new Select(driver.findElement(By.name("BLOOD_GRP_CODE"))).selectByIndex(3);
	    new Select(driver.findElement(By.name("CITIZENSHIP"))).selectByIndex(2);
	    new Select(driver.findElement(By.name("SC_PROOF"))).selectByVisibleText("No");
	    driver.findElement(By.name("ADDRESS1")).sendKeys("Ramalayam street");
	    driver.findElement(By.name("MOBILE_NO")).sendKeys("8985988525");
	    driver.findElement(By.name("EMAIL_ID")).sendKeys("divyaguna0021@gmail.com");
	    new Select(driver.findElement(By.name("COUNTRY_CODE"))).selectByIndex(1);
	    driver.findElement(By.name("ADDRESS2")).sendKeys("varighedu");
	    driver.findElement(By.name("ZIP")).sendKeys("534225"); 
	    driver.findElement(By.name("image")).sendKeys("C:\\Users\\admin\\Pictures\\divya.jpg");
	    driver.findElement(By.name("submit")).click();
	    Thread.sleep(3000);
  }
	    
  @Test(priority=3)

	    public void alert_hms(){
	  
	  //alert handling
	    String str=driver.switchTo().alert().getText();
	  System.out.println(str);
	  driver.switchTo().alert().accept();
  }
//  @Test(priority=4)
//   public void feedback() {
//   driver.findElement(By.linkText("Feedback")).click();
//   driver.findElement(By.id("name")).sendKeys("kranthi");
//   driver.findElement(By.id("email")).sendKeys("divyaguna0021@gmail.com");
//   }
  
 
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
