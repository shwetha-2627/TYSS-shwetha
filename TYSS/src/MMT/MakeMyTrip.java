package MMT;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class MakeMyTrip {
	
	@Test
	public void dateCompare()throws Exception{
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com");
		Thread.sleep(2000);
		driver.findElement(By.id("hp-widget__sTo")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@id='ui-id-2']/li[@aria-label='Top Cities : Goa, India ']")).click();
		Thread.sleep(3000);
		
		String Month = driver.findElement(By.xpath("//div[@class='dateFilter hasDatepicker']/descendant::div[@class='ui-datepicker-title'][1]/descendant::span[@class='ui-datepicker-month']")).getText();
		Thread.sleep(3000);
		String aYear = driver.findElement(By.xpath("//div[@class='dateFilter hasDatepicker']/descendant::div[@class='ui-datepicker-title'][1]/descendant::span[@class='ui-datepicker-year']")).getText();
		System.out.println(Month);
		System.out.println(aYear);
		Thread.sleep(1000);
		String aDay = driver.findElement(By.xpath("//div[@class='dateFilter hasDatepicker']/descendant::td[@class=' ui-datepicker-days-cell-over  ui-datepicker-current-day ui-datepicker-today']/a[@class='ui-state-default ui-state-highlight ui-state-active']")).getText();
		System.out.println(aDay);
		
		String MMM = Month.substring(0, 3);
		String M=MMM.substring(0, 1);
		String mm=MMM.substring(1).toLowerCase();
		String Mmm=M+mm;
		System.out.println(Mmm);
		
		String Date=Mmm+" "+aDay+","+aYear;
		
		LocalDate aDate = LocalDate.parse(Date, DateTimeFormatter.ofPattern("MMM d,yyyy"));
		System.out.println(aDate);
		LocalDate eDate= LocalDate.now();
	
		Assert.assertEquals(eDate, aDate);
		
		
		LocalDate departDate = LocalDate.from(aDate).plusDays(30);
		System.out.println(departDate);
		String RMonth = driver.findElement(By.xpath("//div[@class='dateFilter hasDatepicker']/descendant::div[@class='ui-datepicker-title'][2]/descendant::span[@class='ui-datepicker-month']")).getText();
		Thread.sleep(3000);
	//	String RYear = driver.findElement(By.xpath("//div[@class='dateFilter hasDatepicker']/descendant::div[@class='ui-datepicker-title'][2]/descendant::span[@class='ui-datepicker-year']")).getText();
		System.out.println(RMonth);
		System.out.println(departDate.getMonth().toString());
		int rDate = departDate.getDayOfMonth();
		System.out.println(rDate);
		if(departDate.getMonth().toString().equals(RMonth))
		{
			driver.findElement(By.xpath("//div[@class='dateFilter hasDatepicker']/descendant::div[@class='ui-datepicker-group ui-datepicker-group-last']/table[@class='ui-datepicker-calendar']/descendant::tr/td[@data-handler='selectDay' ]/a[.='"+rDate+"']")).click();
		}
		else
			driver.findElement(By.xpath("//div[@class='dateFilter hasDatepicker']/descendant::div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-right']/a/span")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='inputM inputHlp disable inputDateFilter']")).click();
		Thread.sleep(2000);
		
		LocalDate returnDate = LocalDate.from(departDate).plusDays(20);
		driver.findElement(By.xpath("//div[@class='dateFilterReturn hasDatepicker']/descendant::div[@class='ui-datepicker-group ui-datepicker-group-first']/table[@class='ui-datepicker-calendar']/descendant::tr/td[@data-handler='selectDay']/a[.='"+returnDate.getDayOfMonth()+"']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("searchBtn")).click();
		Thread.sleep(2000);				
		driver.close();
	}

}
