package genericMethods;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.annotations.Test;

public class TestRerun {
	@Test
	public void test() {
		TestNG test=new TestNG();
		List<String> ls= new ArrayList<>();
		test.setTestSuites(ls);
		test.run();
	}

}
