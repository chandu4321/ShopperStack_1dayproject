package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import ShoppersStack.BaseClass;

public class TC_06  extends BaseClass{
	@Test
	public void cancelOrder() throws InterruptedException {
		WebDriverWait wait= new WebDriverWait(driver, 15);
		//user is clicked on beauty product and selected first product
		driver.findElement(By.xpath("//a[text()='Beauty']")).click();
		driver.findElement(By.xpath("//span[text()='dude dont touch my gloss']")).click();
		//user clicked on Add to Cart button
		driver.findElement(By.id("Add To Cart")).click();
		driver.findElement(By.xpath("//*[name()='svg' and @id=\"cartIcon\"]")).click();
		//user clicked on Buy Now button
		driver.findElement(By.xpath("//span[text()='Buy Now']")).click();
		Reporter.log("buy now",true);
		Thread.sleep(3000);
		//user clicked on Address and clicked on Proceed button and selected on COD option and Proceed 
		driver.findElement(By.name("address")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='a']")));
		driver.findElement(By.xpath("//input[@value='COD']")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		Reporter.log("Product is ordered",true);
	}
} 


