package testng;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RerunnerClass implements IRetryAnalyzer{
      int minCount=0,maxCount=3;
	public boolean retry(ITestResult result) {
		if (minCount<maxCount) {
			minCount++;
			return true;
			}
		
		return false;
	}

}
