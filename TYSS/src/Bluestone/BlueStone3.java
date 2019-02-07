package Bluestone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class BlueStone3 {
	
       public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com");
		Actions action = new Actions(driver);
		WebElement mainmenu = driver.findElement(By.xpath("//div[@class='bottom-header']/descendant::nav/ul/li"));
		action.moveToElement(mainmenu).perform();
		WebElement submain = driver.findElement(By.xpath("//div[@class='bottom-header']/descendant::nav/ul/li/a[contains(.,'All')]"));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		action.moveToElement(submain).perform();
		driver.findElement(By.xpath("//div[@class='bottom-header']/descendant::nav/ul/li/a[contains(.,'All')]/ following-sibling::div/descendant::div/div[@class='wh-submenu-header' and contains(.,'Men')]/parent::div/descendant::li/a[contains(.,'Kadas')]")).click();
	    driver.findElement(By.xpath("//div[@id='grid-view-result']/descendant::li/div")).click();
	    driver.findElement(By.xpath("//input[@id='buy-now']")).click();
	    String errormsg = driver.findElement(By.className("formErrorContent")).getText();
	    String expected="* This field is required";
	    Assert.assertEquals(errormsg, expected);
	    System.out.println("Error msg dispalyed");
	    driver.close();
}
}
