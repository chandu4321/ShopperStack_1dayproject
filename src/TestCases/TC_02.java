package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import ShoppersStack.BaseClass;
/***
 * 
 * @author sudarshan
 *
 */
public class TC_02 extends BaseClass {
	@Test
	// T5- User should be able to edit the address
	public void TestCase2() {
		driver.findElement(By.xpath("//div[text()='a']")).click();
		driver.findElement(By.xpath("//li[text()='My Profile']")).click();
		driver.findElement(By.xpath("//div[text()='My Addresses']")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
		// Update the Adress textfields

		WebElement name = driver.findElement(By.id("Name"));
		// TO clear the text field
		name.sendKeys(Keys.CONTROL + "A");
		name.sendKeys(Keys.DELETE);
		name.sendKeys("Kumar");
		WebElement house = driver.findElement(By.id("House/Office Info"));

		house.sendKeys(Keys.CONTROL + "A");
		house.sendKeys(Keys.DELETE);
		house.sendKeys("SkillsTech");

		WebElement street = driver.findElement(By.id("Street Info"));
		street.sendKeys(Keys.CONTROL + "A");
		street.sendKeys(Keys.DELETE);
		street.sendKeys("MainRoad");

		WebElement mark = driver.findElement(By.id("Landmark"));
		mark.sendKeys(Keys.CONTROL + "A");
		mark.sendKeys(Keys.DELETE);
		mark.sendKeys("Factory-Outlet");
		
		driver.findElement(By.id("Update Address")).click();

	}
}
