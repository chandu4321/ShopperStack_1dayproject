package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import ShoppersStack.BaseClass;
/***
 * 
 * @author sudarshan
 *
 */
public class TC_01 extends BaseClass {
	@Test
	// T4 - User should be able to add the address
	
	public void TestCase() throws InterruptedException {
		System.out.println(driver.getTitle());
		//user entering the details
		driver.findElement(By.xpath("//div[text()='a']")).click();
		driver.findElement(By.xpath("//li[text()='My Profile']")).click();
		driver.findElement(By.xpath("//div[text()='My Addresses']")).click();
		driver.findElement(By.xpath("//button[text()='Add Address']")).click();
		driver.findElement(By.id("Name")).sendKeys("Dinesh");
		driver.findElement(By.id("House/Office Info")).sendKeys("TYSS");
		driver.findElement(By.id("Street Info")).sendKeys("Katriguppe");
		driver.findElement(By.id("Landmark")).sendKeys("BigBazar");
		WebElement dropdown = driver.findElement(By.id("Country"));
		//Handling of dropdown using select class
		Select select = new Select(dropdown);
		select.selectByValue("India");
		WebElement state = driver.findElement(By.id("State"));
		select = new Select(state);
		select.selectByValue("Karnataka");
		WebElement city = driver.findElement(By.id("City"));
		select = new Select(city);
		select.selectByValue("Bengaluru");
		driver.findElement(By.id("Pincode")).sendKeys("432101");
		driver.findElement(By.id("Phone Number")).sendKeys("9876543210");
		driver.findElement(By.id("addAddress")).click();

	}

}
