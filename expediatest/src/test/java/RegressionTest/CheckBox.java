package RegressionTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CheckBox extends BaseExpedia {
	
	
	@Test
	public void box() {
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Tables");
		driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
		driver.findElement(By.xpath("//*[@id=\"p_85/2470955011\"]/span/a/div/label/i")).click();
		driver.findElement(By.xpath("//*[@id=\"p_76/2661625011\"]/span/a/div[1]/label/i")).click();
		/*
		 * driver.findElement(By.id("mbb-offeringID-1")).click();
		 * driver.findElement(By.id("gift-wrap")).click();
		 */
	}

}
