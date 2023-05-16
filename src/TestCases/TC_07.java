package TestCases;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import ShoppersStack.BaseClass;

public class TC_07 extends BaseClass {
	@Test
	public void trackOrder() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Beauty']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='dude dont touch my gloss']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Add To Cart")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[name()='svg' and @id=\"cartIcon\"]")).click();
		driver.findElement(By.xpath("//span[text()='Buy Now']")).click();
		Reporter.log("buy now",true);
		Thread.sleep(3000);
		driver.findElement(By.name("address")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		driver.findElement(By.xpath("//input[@value='COD']")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		Reporter.log("Product is ordered",true);
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Help Center")).click();
		Thread.sleep(2000);
		Reporter.log("nagivated to help center",true);
		driver.findElement(By.xpath("//button[text()='Deliver Order']")).click();
		Reporter.log("click on deliver order",true);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("nrSBTYV8g");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Deliver']")).click();
	}
}


