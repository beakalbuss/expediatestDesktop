package RegressionTest;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Listners implements ITestListener{
	
	@Test
	public void onTest(ITestResult result) {

		Reporter.log("ScreenShot");
		System.out.println("Capturing Screen Shot");
}
}