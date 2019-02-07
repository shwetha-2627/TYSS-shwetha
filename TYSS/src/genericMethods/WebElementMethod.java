package genericMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebElementMethod {
	
	public WebElement myFindElement(String locator , String value, WebDriver driver) {
		
		WebElement webl=null;
		
		if(locator.equals("id"))
			webl=driver.findElement(By.id(value));
		else if(locator.equals("tagName"))
			webl=driver.findElement(By.tagName(value));
		else if(locator.equals("name"))
			webl=driver.findElement(By.name(value));
		else if(locator.equals("className"))
			webl=driver.findElement(By.className(value));
		else if(locator.equals("xpath"))
			webl=driver.findElement(By.xpath(value));
		else if(locator.equals("cssSelector"))
			webl=driver.findElement(By.cssSelector(value));
		else if(locator.equals("linkText"))
			webl=driver.findElement(By.linkText(value));
		else if(locator.equals("partialLinkText"))
			webl=driver.findElement(By.partialLinkText(value));
		
		return  webl;
	}
	
	public static void main(String [] args)
	{
		
	}

}
