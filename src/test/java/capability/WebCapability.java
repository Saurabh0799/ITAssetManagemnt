package capability;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebCapability {

	
	WebDriver driver;
	public WebDriver WebCapability() {
		try {
			ChromeOptions opt = new ChromeOptions();
			WebDriverManager.chromedriver().setup();
//			opt.addArguments("headless");
			opt.addArguments("window-size=1920,1080");
			opt.addArguments("no-sandbox");
			opt.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(opt);
			
			try {
				WebDriverWait wait = new WebDriverWait(driver, 2);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("613f36402")));
			} catch (Exception ex) {
				ex.getMessage();
			}
			File source = new File("./Resources");
			System.out.println(source);
			try {
				System.out.println("heloo");
				FileUtils.cleanDirectory(source);

			} catch (IOException e) {

				e.printStackTrace();
			}
		}
		catch(Exception e){}		
		return driver;
	}
}
