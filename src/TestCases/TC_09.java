package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import ShoppersStack.BaseClass;

public class TC_09 extends BaseClass {
	@Test
	// User is able to delete the previous liked product
	public void deleteLikedItems() throws InterruptedException {
		WebDriverWait explicitwait = new WebDriverWait(driver, 20);
		driver.findElement(By.xpath("//div[text()='a']")).click();
		driver.findElement(By.xpath("//li[text()='My Profile']")).click();
		driver.findElement(By.xpath("//div[text()='My Likes']")).click();
		WebElement dropDown = driver.findElement(By.id("Category"));
		Select s = new Select(dropDown);
		s.selectByValue("women");
		driver.findElement(By.name("Submit")).click();
		driver.findElement(By.id("Delete Women")).click();

	}
}
