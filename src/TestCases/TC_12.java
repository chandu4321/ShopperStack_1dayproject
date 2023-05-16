package TestCases;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import ShoppersStack.BaseClass;

public class TC_12 extends BaseClass {
	@Test
	public void TC_001() throws InterruptedException {
		driver.findElement(By.id("search")).click();
		driver.findElement(By.id("search")).sendKeys("men");
		Thread.sleep(2000);
		driver.findElement(By.id("searchBtn")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'featuredProducts_cardBody')]/..)[1]")).click();
		driver.findElement(By.id("Add To Cart")).click();
		driver.findElement(By.id("cartIcon")).click();
		Reporter.log("Product is added to cart",true);
		
	}

}
