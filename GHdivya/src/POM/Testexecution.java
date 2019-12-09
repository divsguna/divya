package POM;

import org.testng.annotations.Test;

public class Testexecution extends Repository{
@Test
public void verifylogin() throws InterruptedException {
	Repository.login();
	Thread.sleep(3000);
}

}




