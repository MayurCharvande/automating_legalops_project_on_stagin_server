package TestCases;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listner implements ITestListener
{
	public void onTestStart(ITestResult result) 
	{
	System.out.println("test has started="+result.getName());
	}

	public void onTestFailure(ITestResult result)
	{
	System.out.println("test has failed="+result.getName());
	}

	public void onTestSkipped(ITestResult result)
	{
	System.out.println("test has skipped="+result.getName());	
	}

}
