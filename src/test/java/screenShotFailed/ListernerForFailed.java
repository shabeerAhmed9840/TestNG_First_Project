package screenShotFailed;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import testng.BaseClass;

public class ListernerForFailed extends BaseClass implements ITestListener{

	public void onTestStart(ITestResult result) {

		
	}

	public void onTestSuccess(ITestResult result) {

		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("FailedTestCase");
		try {
			failedScreenshot("C:\\Users\\SHABEER AHMED\\eclipse-workspace\\TestNGDemo\\ScreenShot\\", 
					result.getMethod().getMethodName());
		} catch (Exception e) {
			e.printStackTrace();
		}

		
	}

	public void onTestSkipped(ITestResult result) {

		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

		
	}

	public void onStart(ITestContext context) {

		
	}

	public void onFinish(ITestContext context) {

		
	}

}
