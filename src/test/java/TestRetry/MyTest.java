package TestRetry;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class MyTest {
	int counter= 0;
	//@Test(retryAnalyzer=Analyzer.TestLevelRetry.class)
	@Test
	public void TestRetry() {
		counter++;
		System.out.println("Testing the Retry Logic in TestNg  "+counter);
		
		if(counter==3) {
			Assert.assertEquals(true, true);
		}else {
			Assert.assertEquals(false, true);
		}
	}
	
}
