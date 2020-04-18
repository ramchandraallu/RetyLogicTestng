package Analyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class TestLevelRetry implements IRetryAnalyzer{
	int counter=0;
	int retryLimit=3;
	public boolean retry(ITestResult result) {
		if(counter<retryLimit) {
			counter=counter+1;
			return true;
		}
		return false;
	}

}
