package genericMethods;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class jQueryDrag {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, FileNotFoundException, IOException, InterruptedException
	{
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/slider/");
		driver.switchTo().frame(0);
		WebElement slider = driver.findElement(By.cssSelector("\"span.ui-slider-handle\""));
		Actions act=new Actions(driver);
		act.click(slider).build().perform();
		
	}
}