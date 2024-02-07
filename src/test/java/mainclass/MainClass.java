package mainclass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import capability.WebCapability;
import login.Login;

public class MainClass extends WebCapability{
	WebDriver driver;
	Login login=new Login();


	@BeforeTest
	public void openchrome()
	{
		driver = WebCapability();
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void login() throws InterruptedException, IOException
	{
		//		new Login(driver);
		login.text001Login(driver);
	}

	@Test(priority = 2)
	public void test002LoginInvalidCredentials() throws InterruptedException, IOException
	{
		login.test002LoginInvalidCredentials(driver);
	}

	@Test(priority = 3)
	public void test003ForgotPassword() throws InterruptedException
	{
		login.test003forgotPassword(driver);
	}

	@Test(priority = 4)
	public void test004Contactus() throws InterruptedException
	{
		login.test004Contactus(driver);
	}

	@AfterTest
	public void closebrowser()
	{
		//		driver.quit();
	}																																												


}
