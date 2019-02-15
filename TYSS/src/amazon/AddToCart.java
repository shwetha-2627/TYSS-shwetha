package amazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AddToCart {
	
	public static void main(String[] args) throws Exception
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://amazon.com");
		//Actions act=new Actions(driver);
		//act.moveToElement(driver.findElement(By.xpath("//div[@id='nav-tools']/descendant::a[@class='nav-a nav-a-2']"))).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='nav-tools']/descendant::a[@class='nav-a nav-a-2']")).click();
		driver.findElement(By.xpath("//div[@class='a-row a-spacing-base']/input")).sendKeys("8123812017");
		driver.findElement(By.xpath("//div[@class='a-section a-spacing-large']/input")).sendKeys("26272394");
		driver.findElement(By.id("signInSubmit")).click();
		driver.findElement(By.xpath("//div[@id='gw-card-layout']/div[@id='desktop-grid-3']")).click();
		String atext=null;
		try {
			driver.findElement(By.xpath("//div[@class='a-section a-spacing-medium']/descendant::div[@class='a-section aok-relative s-image-fixed-height']/img[@data-image-index='1']")).click();
			
			
		} catch (Exception e) {
			Thread.sleep(1000);
			//driver.findElement(By.xpath("//ul[@id='s-results-list-atf']/li[@id='result_1']")).click();
			driver.findElement(By.xpath("//ul[@id='s-results-list-atf']/li[@id='result_1']/descendant::div[@class='a-row a-spacing-base']")).click();
		 
		}

		Thread.sleep(1000);
		atext=driver.findElement(By.id("productTitle")).getText().trim().substring(0, 50);
		
		System.out.println(atext);
		Thread.sleep(2000);
		driver.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("nav-cart-count")).click();
		String text=driver.findElement(By.xpath("//div[@class='a-row sc-list-item sc-list-item-border sc-java-remote-feature']/div[@class='sc-list-item-content']")).getText().substring(0, 50);
		System.out.println(text);
		Assert.assertEquals(text, atext);
		System.out.println("The product is successfully added....");
		driver.close();
		
	}

}
