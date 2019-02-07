package Bluestone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ChatWithExperts {
	
	@Test
	public void testChat() throws InterruptedException {
	
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(5000);
		driver.switchTo().frame("wiz-iframe");
		driver.findElement(By.xpath("//div[@id='contentDiv']/descendant::span[@class='CT_BannerClose']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("livechat-compact-view");
		driver.findElement(By.id("open-label")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("livechat-full-view");
		//driver.switchTo().activeElement().sendKeys("shwetha");
		driver.findElement(By.xpath("//div[@class='form']/descendant::div[@id='container_2']/p/input")).sendKeys("Shwetha");
		driver.findElement(By.xpath("//div[@class='form']/descendant::div[@id='container_3']/p/input")).sendKeys("shwethanm.26u@gmail.com");
		driver.findElement(By.xpath("//div[@class='form']/descendant::div[@id='container_4']/p/input")).sendKeys("8123812137");
		
		driver.findElement(By.xpath("//div[@class='form']/descendant::div[@id='container_10']/p/input")).submit();
		WebDriverWait wait=new WebDriverWait(driver, 600);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//table[@id='content']/descendant::span[@id='textarea-wrapper']/textarea[@class='textarea-bg textarea-font']")));
		
		driver.findElement(By.xpath("//table[@id='content']/descendant::span[@id='textarea-wrapper']/textarea[@class='textarea-bg textarea-font']")).sendKeys("Hi... what todays gold rate");
		driver.findElement(By.xpath("//table[@id='content']/descendant::span[@id='textarea-wrapper']/textarea[@class='textarea-bg textarea-font']")).sendKeys(Keys.ENTER);
	
	}

}
