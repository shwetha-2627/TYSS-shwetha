package Bluestone;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PriceLessThan {
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
		List<WebElement> list = driver.findElements(By.xpath("//div[@id='grid-view-result']/descendant::div[@class='inner pd-gray-bg']/descendant::span[@class='b-price-wrapper']/descendant::span[@class='new-price']"));
		
		int count=0;
		
		for(int i=0;i<list.size();i++) {
			
		int price=Integer.parseInt(list.get(i).getText().substring(3).replace(",", "").replace(" ", ""));
		
		System.out.println(price);
		if(price<10000)
			count++;
		}
		System.out.println("total  no rings below 10000 is:"+count);
		
		driver.close();
	}
}
