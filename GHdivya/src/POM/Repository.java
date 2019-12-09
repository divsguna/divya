package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Repository {
public static WebDriver driver;
	//login
	@Test
	public static void login() {
	driver.findElement(LOCATORS.user).sendKeys(Data.user);
	driver.findElement(LOCATORS.password).sendKeys(Data.password);
	driver.findElement(LOCATORS.login).click();
		}
	@BeforeTest
public static void openurl() {
		System.setProperty("webdriver.chrome.driver", "C:\\HMSworkspace\\Software\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(Data.url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		
		
	}
}
