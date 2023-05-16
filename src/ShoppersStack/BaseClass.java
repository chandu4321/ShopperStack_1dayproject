package ShoppersStack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

/***
 * 
 * @author Sudarshan
 *
 */
public class BaseClass {
	public WebDriver driver;

	@BeforeClass
	// Step1: Launching the Browser
	public void browserSetUp() {
		driver = new ChromeDriver();
		Reporter.log("The empty browser is Launched", true);
		driver.manage().window().maximize();
		Reporter.log("Browser window is Maximized", true);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.shoppersstack.com/");
		driver.findElement(By.id("loginBtn")).click();

	}

	// Login the user
	@BeforeMethod
	public void LoginUser() {
		driver.findElement(By.id("Email")).sendKeys("abcdef.r@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Sumanth@123");
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		Reporter.log("User Login Sucessfully", true);
	}

	@AfterMethod
	public void LogOut() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[text()='a']")).click();
		driver.findElement(By.xpath("//li[text()='Logout']")).click();
		Reporter.log("User Logout Sucessfully", true);
	}

	@AfterClass
	public void quitBrowser() {
		driver.quit();
		Reporter.log("Server Closed Sucessfully", true);
	}

}
