package Bluestone;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class offers {

	@Test
	public void testOffers() throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(5000);
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//div[@class='bottom-header']/div/nav/ul/li/a[.='Offers ']"))).perform();
		
		driver.findElement(By.xpath("//div[@class='bottom-header']/div/nav/ul/li/a[.='Offers ']/following-sibling::div/ul/descendant::span[.='0% Making Charge']")).click();
		List<WebElement> offers = driver.findElements(By.xpath("//div[@id='grid-view-result']/descendant::span[@class='offers-wrapper']"));
		System.out.println(offers.get(0).getText());
		String eStatement=driver.findElement(By.xpath("//div[@id='grid-view-result']/descendant::span[@class='offers-wrapper']")).getText();
		String aStatement=offers.get(0).getText();
		System.out.println(eStatement.toUpperCase());
		Assert.assertEquals(eStatement.toUpperCase(), aStatement);
		
		driver.close();
		}

}
