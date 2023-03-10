package com.listener;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;


import ultlity.ExtentRe;

public class ListinerClass extends ExtentRe implements ITestListener {
	
	public void onTestStart(ITestResult result) {
		  test=extent.createTest(result.getName());
		 
	}

	public void onTestSuccess(ITestResult result) {
		if(result.getStatus()==ITestResult.SUCCESS) {
			test.log(Status.PASS, "Pass Test case is:" + result.getName());
		}
	}

	

	public void onTestFailure(ITestResult result) {
		
		if(result.getStatus()==ITestResult.FAILURE) {
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+ " - Test Case Failed", ExtentColor.RED));
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getThrowable()+ " - Test Case Failed", ExtentColor.RED));
			}

	}

	public void onTestSkipped(ITestResult result) {
		if(result.getStatus()==ITestResult.SKIP) {
			test.log(Status.SKIP, "Skipped Test case is:"+ result.getName());

	}

	}
	
}
