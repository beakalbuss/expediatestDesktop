package expediatest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class expediaElement extends BaseExpedia{

	@Test
	public void exElement() {
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Arts");
		driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
		
		
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		
		Select select = new Select(dropdown);
		select.selectByVisibleText("Appliances");

	
	//driver.quit();
	}
}
