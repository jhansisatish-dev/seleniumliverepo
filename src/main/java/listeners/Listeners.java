package listeners;

import org.openqa.selenium.WebDriver;
//import org.testng.ITestListener;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class Listeners implements ITestListener {


	@Override
	public void onTestFailure(ITestResult result) {
		
		WebDriver driver = null;
		
		String testMethodName = result.getName();
		
		try {
			driver = (WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		takeScreenshot(testMethodName,driver);
		
	}

	private void takeScreenshot(String testMethodName, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	
}