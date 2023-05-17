package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import ShoppersStack.BaseClass;

public class TC_15 extends BaseClass {
	@Test
	//User should be able search the product from search Bar
	public void address() {
		WebElement searchButton = driver.findElement(By.id("search"));
		searchButton.sendKeys("mobiles");
	}

}
