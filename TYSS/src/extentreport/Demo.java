package extentreport;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class Demo {
	ExtentReports reports = new ExtentReports();
	ExtentTest test=reports.createTest("demoTest");
	
	@Test
	public void demoTest() {
	
		
		ExtentHtmlReporter rep = new ExtentHtmlReporter("C:\\Users\\Rohith\\git\\repository01\\TYSS\\report1\\rep.html");
		rep.config().setDocumentTitle("Automation report");
		rep.config().setReportName("Test report");
		rep.config().setTheme(Theme.DARK);
			
		reports.attachReporter(rep);
		
		reports.setSystemInfo("hostName","shwetha");
		reports.setSystemInfo("testerName","shwetha");
		reports.setSystemInfo("environmentName","windows");
		reports.setSystemInfo("projectName","demo extent reports");
		
		test.log(Status.INFO, "running extent report");
		//Assert.fail();
	}
	
	@AfterMethod
	public void afterTest(ITestResult r) {
		System.out.println(r.getStatus());
		System.out.println(r.getMethod().getMethodName());
		if (r.getStatus()==ITestResult.SUCCESS) {
			
			test.log(Status.PASS, "test is passed");
			reports.flush();
		}
		else {
			test.log(Status.FAIL, "failed");
			reports.flush();
		}
	}
}
