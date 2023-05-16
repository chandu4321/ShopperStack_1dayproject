package TestCases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import ShoppersStack.BaseClass;
/***
 * 
 * @author sudarshan
 *
 */
public class TC_03 extends BaseClass {
	@Test
	//T13-User should be able to delete Address
	public void TestCase03() throws InterruptedException {
		driver.findElement(By.xpath("//div[text()='a']")).click();
		driver.findElement(By.xpath("//li[text()='My Profile']")).click();
		driver.findElement(By.xpath("//div[text()='My Addresses']")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Yes']")).click();
		Thread.sleep(1000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
	}

}
