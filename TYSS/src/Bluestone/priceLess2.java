package Bluestone;

import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class priceLess2 {
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
		act.moveToElement(driver.findElement(By.xpath("//div[@id='top-filter']/descendant::div[@class='top-filter-blocks']/section[@id='Price-form']"))).perform();
		Thread.sleep(2000);
		String count=driver.findElement(By.xpath("//div[@id='top-filter']/descendant::div[@class='top-filter-blocks']/section[@id='Price-form']/descendant::span[@class='prcs-dlh']/span[@class='items-count']")).getText();
		System.out.println("no. of rings available for next day delivery are:"+count);
		
		driver.close();
	}
}
