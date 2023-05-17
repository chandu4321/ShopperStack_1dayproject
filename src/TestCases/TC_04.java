package TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import ShoppersStack.BaseClass;

/***
 * 
 * @author sudarshan
 *
 */
public class TC_04 extends BaseClass {
	@Test
	// T-23 User should able to buy wishlisted product using debit card
	public void TestCase23() {
		driver.findElement(By.id("beautyProducts")).click();
		driver.findElement(By.xpath("//*[name()='svg' and @data-testid='FavoriteIcon']")).click();
		driver.findElement(By.xpath("//div[text()='a']")).click();
		driver.findElement(By.xpath("//li[text()='Wish List']")).click();
		driver.findElement(By.xpath("//button[text()='Add To Cart']")).click();
		driver.findElement(By.xpath("//*[name()='svg' and @id='cartIcon']")).click();
		driver.findElement(By.id("buynow_fl")).click();
		driver.findElement(By.name("address")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		//Adding the Card Details
		driver.findElement(By.xpath("//button[text()='Add Card']")).click();
		driver.findElement(By.xpath("//input[@id=':r4:']")).sendKeys("abcd");
		driver.findElement(By.id(":r3o:")).sendKeys("3014401191608303");
		driver.findElement(By.id(":r3p:")).sendKeys("1802");
		driver.findElement(By.id(":r3q:")).sendKeys("5");
		driver.findElement(By.id(":r3r:")).sendKeys("28");
		driver.findElement(By.id(":r3s:")).sendKeys("320");
		driver.findElement(By.name("radio-buttons-group")).click();
		driver.findElement(By.xpath("//button[text()='Add']")).click();
		
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();

	}
}