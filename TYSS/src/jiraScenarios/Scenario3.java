/*
 Open browser
enter URL(bluestone)
scroll upto some axis 
check wheather top icon is dispalyed or not
if it displayed click on it
close browser
 */

package jiraScenarios;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Scenario3 {
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, FileNotFoundException, IOException, InterruptedException
	{
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		JavascriptExecutor exe=(JavascriptExecutor)driver;
		for (int i = 0; i < 10; i++) {
			Thread.sleep(1000);
		exe.executeScript("window.scrollBy(500,500)","");
		}
		WebElement element=driver.findElement(By.className("logo-icon"));
		Thread.sleep(2000);
		if (element.isDisplayed()) {
			element.click();
			System.out.println("icon clicked");
		}
		else
			System.out.println("icon not present");
		driver.close();
	}

}
