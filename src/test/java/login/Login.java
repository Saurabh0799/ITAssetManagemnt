package login;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

	WebDriver driver;
	String url="https://itassetmanagementsoftware.com/rolepermission/login";
	public void text001Login(WebDriver driver) throws InterruptedException, IOException
	{
		this.driver=driver;
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(url);
		WebDriverWait wait=new WebDriverWait(driver, 10);

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='Remember me']")).click();//click on remeber me check box
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='btnContinue']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='btnSubmit']")).click();
		Thread.sleep(2000);
		//		driver.findElement(By.xpath("//*[@id=\"loginFrm\"]/div[3]/label/span")).click();
		String error=driver.findElement(By.xpath("//span[contains(text(),'Please enter valid username and password')]")).getText().toString();
		//		error.getText();
		String text=error;
		System.out.println("Error Message after wrong credentials " + text);	
		try {  
			//Date format for screenshot file name
			SimpleDateFormat df=new  SimpleDateFormat("dd-MMM-yyyy__hh_mm_ssaa");
			Date date =new Date();
			String fileName = df.format(date);
			File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			//copy screenshot file into screenshot folder.
			FileUtils.copyFile(file, new File(System.getProperty("user.dir")+"//Screenshot//"+fileName+".jpg"));
			System.out.println("Screenshot is Captured");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void test002LoginInvalidCredentials(WebDriver driver) throws InterruptedException
	{
		this.driver=driver;
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("Saurabh");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='btnContinue']")).click();
		Thread.sleep(2000);
		String error=driver.findElement(By.xpath("//span[contains(text(),'Please enter valid username to continue')]")).getText().toString();
		String text=error;
		System.out.println(text +" error msg");
		try {  
			//Date format for screenshot file name
			SimpleDateFormat df=new  SimpleDateFormat("dd-MMM-yyyy__hh_mm_ssaa");
			Date date =new Date();
			String fileName = df.format(date);
			File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			//copy screenshot file into screenshot folder.
			FileUtils.copyFile(file, new File(System.getProperty("user.dir")+"//Screenshot//"+fileName+".jpg"));
			System.out.println("Screenshot is Captured");
		}catch(Exception e) {
			e.printStackTrace();
		}
		Thread.sleep(2000);
	}

	public void test003forgotPassword(WebDriver driver) throws InterruptedException
	{
		this.driver=driver;
		driver.findElement(By.xpath("//a[contains(text(),'Forgot password?')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("saurabh.s@lendenclub.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='btnSubmit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'I already know credential')]")).click();
		Thread.sleep(2000);
	}

	public void test004Contactus(WebDriver driver) throws InterruptedException
	{
		this.driver=driver;
		driver.findElement(By.xpath("//a[contains(text(),'Contact Us')]")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);

		try {
			driver.findElement(By.xpath("//button[@id='pea_cook_btn']")).click();
			Thread.sleep(3000);
		}catch (Exception e) {
			driver.findElement(By.xpath("/html[1]/body[1]/div[10]/p[1]/button[1]")).click();
			Thread.sleep(3000);
		}

		driver.findElement(By.xpath("/html[1]/body[1]/div[5]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]")).sendKeys("Saurabh Sharma");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html[1]/body[1]/div[5]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/input[1]")).sendKeys("saurabh.sharm799@gmail.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html[1]/body[1]/div[5]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/input[1]")).sendKeys("im not able to login in my account");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html[1]/body[1]/div[5]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[4]/textarea[1]")).sendKeys("Hi this is Saurabh here");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html[1]/body[1]/div[5]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[5]/input[1]")).sendKeys("8456521301");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		try {  
			//Date format for screenshot file name
			SimpleDateFormat df=new  SimpleDateFormat("dd-MMM-yyyy__hh_mm_ssaa");
			Date date =new Date();
			String fileName = df.format(date);
			File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			//copy screenshot file into screenshot folder.
			FileUtils.copyFile(file, new File(System.getProperty("user.dir")+"//Screenshot//"+fileName+".jpg"));
			System.out.println("Screenshot is Captured");
		}catch(Exception e) {
			e.printStackTrace();
		}
		try {
			driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]")).click();
		}catch (Exception e) {}
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//label[contains(text(),'Subscribe to our newsletter')]")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[contains(text(),'Send message')]")).click();

	}

}
