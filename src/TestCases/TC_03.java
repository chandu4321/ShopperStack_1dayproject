package TestCases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import ShoppersStack.BaseClass;

/***
 * 
 * @author sudarshan
 *
 */
public class TC_03 extends BaseClass {
	@Test
	// T13-User should be able to delete Address
	public void TestCase03() throws InterruptedException {
		driver.findElement(By.xpath("//div[text()='a']")).click();
		driver.findElement(By.xpath("//li[text()='My Profile']")).click();
		driver.findElement(By.xpath("//div[text()='My Addresses']")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
		Thread.sleep(1000);
		// user click on the yes button
		WebElement delete = driver.findElement(By.xpath("//button[text()='Yes']"));
		Reporter.log(delete.getText(), true);
		Thread.sleep(1000);
		// Handling of Alert
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Reporter.log(alert.getText(), true);

	}

}
