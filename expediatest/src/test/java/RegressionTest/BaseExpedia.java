package RegressionTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class BaseExpedia {
	
	WebDriver driver;
	
	@Test 
	public void expediahome() throws InterruptedException {
	//driver = new FirefoxDriver();
	driver = new ChromeDriver();
	driver.get("https://www.amazon.com/");
	driver.manage().window().maximize();
//	System.out.println(driver.getTitle());
//	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Arts");
//
//



//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//

//Thread.sleep(10);
//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//driver.findElement(By.xpath("//*[@id=\"zg_browseRoot\"]/ul/ul/li[1]/a")).click();
//driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]")).click();



// SELECT DROPDOWN ELEMENT
// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
 //  driver.findElement(By.className("nav-search-scope nav-sprite")).click();
   //WebElement dropdown =
 // Select select = new Select(dropdown);
 // dropdown.click();

 // select.selectByVisibleText("Baby");
/*
 * @Test public void test() throws InterruptedException { // saving the GUI
 * element reference into a "element" variable of WebElement type WebElement
 * element = driver.findElement(By.id("Email")); // entering username
 * element.sendKeys("dummy@gmail.com"); element.sendKeys(Keys.RETURN); //
 * entering password driver.findElement(By.id("Passwd")).sendKeys("password");
 * // clicking signin button driver.findElement(By.id("signIn")).click(); //
   explicit wait - to wait for the compose button to be click-able WebDriverWait
 * wait = new WebDriverWait(driver,30);
 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
 * "//div[contains(text(),'COMPOSE')]"))); // click on the compose button as
 * soon as the "compose" button is visible
 * driver.findElement(By.xpath("//div[contains(text(),'COMPOSE')]")).click(); }
 * 
 * @AfterMethod public void teardown() { // closes all the browser windows
 * opened by web driver driver.quit(); }
 * 
 * }
 */

//driver.quit();
}
}
