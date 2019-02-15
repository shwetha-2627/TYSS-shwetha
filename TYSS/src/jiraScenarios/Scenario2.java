/*
open Browser
enter URL(bluestone)
go to search and search for rings 
go to Gender
get count of women
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
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Actions;

public class Scenario2 {
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, FileNotFoundException, IOException, InterruptedException
	{
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("search_query_top_elastic_search")).click();
		driver.findElement(By.id("search_query_top_elastic_search")).sendKeys("Rings");
		driver.findElement(By.xpath("//form[@id='searchbox_elastic_search']/descendant::input[@name='submit_search']")).submit();
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//div[@id='top-filter']/descendant::div[@class='top-filter-blocks']/section[@id='Gender-form']"))).perform();
		Thread.sleep(2000);
		String menRings=driver.findElement(By.xpath("//div[@id='top-filter']/descendant::div[@class='top-filter-blocks']/section[@id='Gender-form']/descendant::span[@data-displayname='men']/span[@class='items-count']")).getText();
		Thread.sleep(2000);
		System.out.println("total no of men rings : "+menRings.substring(1, menRings.length()-1));
		driver.close();
	}

}
