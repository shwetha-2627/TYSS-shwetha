package genericMethods;

import org.testng.Assert;
import org.testng.annotations.Test;
//import org.testng.util.RetryAnalyzerCount;

public class DemoRerun {
	@Test(retryAnalyzer=FailRerunCount.class)
	public void test() {
		System.out.println("running....");
		Assert.fail();
	}

}
