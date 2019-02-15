/*
 open browser
enter URL(blustone)
click on goldmine 10+1 Sceheme
enter monthly amount and email address and click on start now
fill necessary details and click on next
Fill necessary details in next page
verify wheather it is navigating to payment page or not .
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

public class Scenario7 {
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
		
		driver.findElement(By.id("fullname")).sendKeys("abcdefgh");
		driver.findElement(By.id("contactNumber")).sendKeys("1234567890");
		driver.findElement(By.id("address")).sendKeys("abcdefgh hefgwef fjdhfgur");
		driver.findElement(By.id("postcode_delivery")).sendKeys("560091");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.findElement(By.id("nomineeName")).sendKeys("abcdefgh");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		String aPage=driver.findElement(By.xpath("//nav[@id='checkout-navigation']/descendant::span[@class='checkout-current']")).getText();
		String ePage="PAYMENT DETAILS";
		
		Assert.assertEquals(aPage, ePage);
		System.out.println("payment page displayed");		
		driver.close();
	}

}
