package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import ShoppersStack.BaseClass;

public class TC_04 extends BaseClass {
	@Test
	public void address() {
		WebElement searchButton = driver.findElement(By.id("search"));
		searchButton.sendKeys("mobiles");
	}
}
