package TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import ShoppersStack.BaseClass;

public class TC_13 extends BaseClass {
	@Test
	public void TC_003() throws InterruptedException {
		driver.findElement(By.id("cartIcon")).click();
		driver.findElement(By.xpath("//button[text()='Remove from cart']/../../../..")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Yes']")).click();
	}

}
