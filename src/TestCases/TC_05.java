package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import ShoppersStack.BaseClass;

public class TC_05 extends BaseClass {
	@Test
	public void deliverablePincodes() throws InterruptedException {
		//user should be nagivated to help center page
		WebDriverWait wait= new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='a']")));
		driver.findElement(By.xpath("//a[text()='Help Center']")).click();
	}
}
