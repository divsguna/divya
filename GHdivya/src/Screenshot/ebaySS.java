package Screenshot;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class ebaySS {
	public WebDriver driver;
  @Test
  public void f() {
  }
  @BeforeTest
  public void openurl() throws Exception {
	  driver = new ChromeDriver();
	  driver.get("https://in.ebay.com/");
   driver.manage().window().maximize();
   Thread.sleep(3000);
  }

  @AfterTest
  public void afterTest() {
  }

}
