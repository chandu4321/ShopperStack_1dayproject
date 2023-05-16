package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import ShoppersStack.BaseClass;

public class TC_11 extends BaseClass{
	@Test
	public void addOfficeAdress() throws InterruptedException {
		driver.findElement(By.xpath("//div[text()='a']")).click();
		driver.findElement(By.xpath("//li[text()='My Profile']")).click();
		driver.findElement(By.xpath("//div[text()='My Addresses']")).click();
		driver.findElement(By.xpath("//button[text()='Add Address']")).click();
		driver.findElement(By.id("Office")).click();
		driver.findElement(By.id("Name")).sendKeys("nisha");
		driver.findElement(By.id("House/Office Info")).sendKeys("TYss");
		driver.findElement(By.id("Street Info")).sendKeys("Kamakya");
		driver.findElement(By.id("Landmark")).sendKeys("Dmart");
		WebElement countryDropdown = driver.findElement(By.id("Country"));
		Select s=new Select(countryDropdown);
		s.selectByValue("India");
		WebElement stateDropdown = driver.findElement(By.id("State"));
		Select s1=new Select(stateDropdown);
		s1.selectByIndex(14);
		WebElement cityDropdown = driver.findElement(By.id("City"));
		Select s2=new Select(cityDropdown);
		s2.selectByIndex(3);
		driver.findElement(By.id("Pincode")).sendKeys("432101");
		driver.findElement(By.id("Phone Number")).sendKeys("9632145655");
		driver.findElement(By.id("addAddress")).click();
	}
}


