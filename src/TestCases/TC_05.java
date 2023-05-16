package TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import ShoppersStack.BaseClass;

public class TC_05 extends BaseClass {
	@Test
	public void deliverablePincodes() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Help Center']")).click();
	}

}
