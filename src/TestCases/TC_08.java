package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import ShoppersStack.BaseClass;

public class TC_08 extends BaseClass {
	@Test
	public  void addingProductsToCart() throws InterruptedException {

		//user should click on all category add multiple products to cart
		//adding men product to cart
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,15);
		driver.findElement(By.xpath("//a[contains(text(),'Men')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[contains(text(),'add to cart')])[1]")).click();
		Reporter.log("men product added to cart",true);

		//adding women product to cart
		driver.findElement(By.xpath("//a[contains(text(),'Women')]")).click();	
		driver.findElement(By.xpath("(//button[contains(text(),'add to cart')])[1]")).click();
		Reporter.log("women product added to cart",true);

		//adding electronics product to cart
		driver.findElement(By.xpath("(//a[contains(text(),'Electronic')])[1]")).click();
		driver.findElement(By.xpath("(//button[contains(text(),'add to cart')])[1]")).click();
		Reporter.log("electronics product added to cart",true);

		//adding beauty products to cart
		driver.findElement(By.xpath("(//a[contains(text(),'Beauty')])[1]")).click();
		driver.findElement(By.xpath("(//button[contains(text(),'add to cart')])[1]")).click();
		Reporter.log("beauty product added to cart",true);
		Thread.sleep(2000);
		
		//visit cart page remove all products 
		driver.findElement(By.id("cartIcon")).click();
		for(int i =1;i<=4;i++) {
		driver.findElement(By.xpath("//button[contains(text(),'Remove from cart')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		Thread.sleep(2000);
		Reporter.log("product removed from cart",true);
		driver.quit();
		}
	
	}




}
