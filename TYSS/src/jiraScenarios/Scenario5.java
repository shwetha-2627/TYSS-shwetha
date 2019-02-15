/*

open browser
enter URL(bluestone)
click on goldmine 10+1 Sceheme
enter monthly amount and email address and click on start now
verify wheather monthly amount and email address entered is reflected in this page
close browser

*/

package jiraScenarios;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class Scenario5 {
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, FileNotFoundException, IOException, InterruptedException
	{
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		driver.findElement(By.className("gms-banner-inner")).click();
		
		String eEmail="testengineer.2627@gmail.com";
		String eAmount="5000";
		Thread.sleep(1000);
		driver.findElement(By.id("amount")).sendKeys(eAmount);
		driver.findElement(By.id("Email")).sendKeys(eEmail);
		
		driver.findElement(By.id("tahLpSubmit")).click();
		Thread.sleep(1000);
		String aEmail=driver.findElement(By.id("email")).getAttribute("value");
		
		String aAmount=driver.findElement(By.xpath("//div[@class='input-wrapper']/descendant::span[@class='subscription-amount subscribed-amount']"))
				.getText().trim().replace("Rs ", "").replace(",", "");
		Thread.sleep(2000);
		System.out.println(aEmail+"   "+aAmount);
		Assert.assertEquals(aAmount, eAmount);
		System.out.println("amount is matched");
		
		Assert.assertEquals(aEmail, eEmail);
		System.out.println("email is matched");
		
		driver.close();
	}
}
