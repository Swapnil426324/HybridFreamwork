package com.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.base.TestBase;

public class TestLinseners extends TestBase implements ITestListener{

	public void onTestStart(ITestResult result) {
		log.info("Test case is starting with name: "+result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		log.info("Test case is passed with name : "+result.getName());
	}

	public void onTestFailure(ITestResult result) {
		log.info("Test case is failed with name : "+result.getName());
		getScreenShot(result.getName());
		log.info("Screenshot Captured failed test case");
	}

	public void onTestSkipped(ITestResult result) {
		log.info("Test case is skipped name : "+result.getName());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
	}

	public void onStart(ITestContext context) {
		log.info("Test suite starting");	
	}

	public void onFinish(ITestContext context) {
		log.info("Test suite finished");
	}

}
