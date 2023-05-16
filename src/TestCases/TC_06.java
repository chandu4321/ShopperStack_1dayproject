package TestCases;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import ShoppersStack.BaseClass;

public class TC_06  extends BaseClass{
	@Test
	public void cancelOrder() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Beauty']")).click();
		driver.findElement(By.xpath("//span[text()='dude dont touch my gloss']")).click();
		driver.findElement(By.id("Add To Cart")).click();
		driver.findElement(By.xpath("//*[name()='svg' and @id=\"cartIcon\"]")).click();
		driver.findElement(By.xpath("//span[text()='Buy Now']")).click();
		Reporter.log("buy now",true);
		Thread.sleep(3000);
		driver.findElement(By.name("address")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		driver.findElement(By.xpath("//input[@value='COD']")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		Reporter.log("Product is ordered",true);
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//div[text()='a']")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//li[text()='My Orders']")).click();
	}
} 


