package customListners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listners implements ITestListener{
	
	public void onTestFailiure(ITestResult result) {

		Reporter.log("screenShot Link");
}
}