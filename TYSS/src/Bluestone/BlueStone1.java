package Bluestone;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BlueStone1 {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, FileNotFoundException, IOException, InterruptedException
	{
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//div[@class='bottom-header']/div/nav/ul/li/a[@title='Rings']"))).perform();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='bottom-header']/div/nav/ul/li/a[@title='Rings']/following-sibling::div/ul/li/div/ul/li/following-sibling::li/a[@title='Diamond Rings']")));
		
		driver.findElement(By.xpath("//div[@class='bottom-header']/div/nav/ul/li/a[@title='Rings']/following-sibling::div/ul/li/div/ul/li/following-sibling::li/a[@title='Diamond Rings']")).click();
		Thread.sleep(1000);
		List<WebElement> defaultPrice = driver.findElements(By.xpath("//span[@class='p-wrap']/span/span/span[@id='bst-discounted-price']"));
		Thread.sleep(1000);
		System.out.println(defaultPrice.size());
		for(int i=0;i<defaultPrice.size();i++)
		setExcelData("./data/priceList.xlsx", "defaultPrice", i, 0,defaultPrice.get(i).getText() );
		
		act.moveToElement(driver.findElement(By.xpath("//section[@class='block sort-by pull-right']"))).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='view-sort-by']/div/a[text()='Price Low to High ']")).click();
		
		List<WebElement> sortedPrice = driver.findElements(By.xpath("//span[@class='b-price-wrapper']/span/span[@class='new-price']"));
		Thread.sleep(5000);
		
		for(int i=0;i<sortedPrice.size();i++)
		setExcelData("./data/priceList.xlsx", "defaultPrice", i, 1,sortedPrice.get(i).getText() );
		
		
		
		driver.close();
		
	}
	
	public static void setExcelData(String  path,String sheetName,int row ,int cell, String value )
	{
		
		Workbook f; 
		try {
			f = WorkbookFactory.create(new FileInputStream(path));
			if (f.getSheet(sheetName).getRow(row) == null) 
				f.getSheet(sheetName).createRow(row).createCell(cell);
			else
				f.getSheet(sheetName).getRow(row).createCell(cell);
			f.getSheet(sheetName).getRow(row).getCell(cell).setCellValue(value);
			f.write(new FileOutputStream(path));
			
		} 
		catch (EncryptedDocumentException  | InvalidFormatException | IOException e  ) 
		{
			e.printStackTrace();
		}	
		
	}
	
	
	
	 
}

