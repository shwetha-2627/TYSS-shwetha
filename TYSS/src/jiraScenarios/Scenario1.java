/*
 Open browser
enter URL(bluestone)
go to search and search for rings
go to gold purity
get count of 22k
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

public class Scenario1 {
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
		//Actions act=new Actions(driver);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='top-filter']/descendant::div[contains(@class,'top-filter-blocks v-m-f v-m-f-toggle')]")).click();
		Thread.sleep(2000);
		String goldPurity=driver.findElement(By.xpath("//section[@id='Gold Purity-form']/descendant::span[@data-displayname='22k']/span[@class='items-count']")).getText();
		Thread.sleep(2000);
		System.out.println("total no of 22k gold purity rings are:"+goldPurity.substring(1, goldPurity.length()-1));
		driver.close();
	}

}
