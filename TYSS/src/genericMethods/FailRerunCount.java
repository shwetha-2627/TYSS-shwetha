package genericMethods;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class FailRerunCount implements IRetryAnalyzer{
	int c=0;
	int cMax=3;
	
	@Override
	public boolean retry(ITestResult result) {
		
		if(result.getStatus()==ITestResult.FAILURE && c<cMax) {
			c++;
			return true;
		}
		
		return false;
	}

}
