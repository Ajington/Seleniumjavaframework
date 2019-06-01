package Listerers;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class testNGListerners implements ITestListener  {

	public void onTestStart(ITestResult result) {

		System.out.println("Test started " + result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Test Success " + result.getName());
		
	}

	public void onTestFailure(ITestResult result) {

		System.out.println("Test fail " + result.getName());
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		
		System.out.println("Test finish " + context.getName());		
	}

}
