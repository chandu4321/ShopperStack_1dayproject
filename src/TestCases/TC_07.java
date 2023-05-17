package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import ShoppersStack.BaseClass;

public class TC_07 extends BaseClass {
	@Test
	public void trackOrder() throws InterruptedException {
		WebDriverWait wait= new WebDriverWait(driver, 10);
		//user is clicked on beauty product and selected first product
		driver.findElement(By.xpath("//a[text()='Beauty']")).click();
		driver.findElement(By.xpath("//span[text()='dude dont touch my gloss']")).click();
		//product is added to cart and user clicked on Buy Now
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='a']")));
		driver.findElement(By.id("Add To Cart")).click();
		
		driver.findElement(By.xpath("//*[name()='svg' and @id='cartIcon']")).click();
		driver.findElement(By.xpath("//span[text()='Buy Now']")).click();
		Reporter.log("buy now",true);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='a']")));
		//user selected address and clicked on COD and Proceed
		driver.findElement(By.name("address")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='a']")));
		driver.findElement(By.xpath("//input[@value='COD']")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		Reporter.log("Product is ordered",true);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='a']")));
		//user should be nagivated to Help Center page then click on Deliver Order and send input in text box
		driver.findElement(By.partialLinkText("Help Center")).click();
		Reporter.log("nagivated to help center",true);
		driver.findElement(By.xpath("//button[text()='Deliver Order']")).click();
		Reporter.log("click on deliver order",true);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("nrSBTYV8g");
		driver.findElement(By.xpath("//button[text()='Deliver']")).click();
	}
}


