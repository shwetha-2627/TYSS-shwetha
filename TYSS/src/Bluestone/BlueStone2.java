package Bluestone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class BlueStone2 {
    /*  @Test
	  public void test() {*/
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com");
		Actions action = new Actions(driver);
		WebElement mainmenu = driver.findElement(By.xpath("//div[@class='bottom-header']/descendant::nav/ul/li"));
		action.moveToElement(mainmenu).perform();
		WebElement submain = driver.findElement(By.xpath("//div[@class='bottom-header']/descendant::nav/ul/li/a[contains(.,'All')]"));
		Thread.sleep(1000);
		action.moveToElement(submain).perform();
		driver.findElement(By.xpath("//div[@class='bottom-header']/descendant::nav/ul/li/a[contains(.,'All')]/ following-sibling::div/descendant::div/div[@class='wh-submenu-header' and contains(.,'Men')]/parent::div/descendant::li/a[contains(.,'Kadas')]")).click();
	    driver.findElement(By.xpath("//div[@id='grid-view-result']/descendant::li/div")).click();
	    WebElement element = driver.findElement(By.xpath("//div[@id='attributes']/div/select[@id='ringselect']"));
	    element.click();
	    Select select = new Select(element);
	    select.selectByValue("02");
	    Thread.sleep(3000);
	    String actualsize = driver.findElement(By.xpath("//div[@id='attributes']/div/select[@id='ringselect']/option[@value='02']")).getText();
	    driver.findElement(By.xpath("//input[@id='buy-now']")).click();
	    //String actualsize = driver.findElement(By.xpath("//div[@class='row line-separator']/div/following-sibling::div[contains(.,'2-2')]")).getText();
	    
	    Thread.sleep(3000);
        String selectedsize =driver.findElement(By.xpath("//div[@class= 'row line-separator size-row']/div[@class='value col-xs-9']")).getText();
        Assert.assertEquals(actualsize, selectedsize);
        driver.close();
	}
	
}
