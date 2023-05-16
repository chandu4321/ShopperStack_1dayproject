package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import ShoppersStack.BaseClass;

public class TC_14 extends BaseClass {
	@Test
	public void TC_002() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, 20);
		driver.findElement(By.id("search")).click();
		driver.findElement(By.id("search")).sendKeys("women");
		Thread.sleep(2000);
		driver.findElement(By.id("searchBtn")).click();
		WebElement product = driver.findElement(By.xpath("(//div[contains(@class,'featuredProducts_cardBody')]/..)[1]"));
		wait.until(ExpectedConditions.elementToBeClickable(product));
		
		product.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='add to cart']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[name()='svg' and @id='cartIcon']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Buy Now']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='address']")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Cash On Delivery (COD)']")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		Reporter.log("User is able to see order is confirmed page",true);
	}

}
