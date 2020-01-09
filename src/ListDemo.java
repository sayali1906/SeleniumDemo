import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListDemo implements ITestListener 
{

	@Override
	public void onTestStart(ITestResult arg0) 
	{
		System.out.println(arg0.getName());
		System.out.println(arg0.getStatus());
	}
	@Override
	public void onTestSuccess(ITestResult arg0) {

		System.out.println(arg0.getName());
		System.out.println(arg0.getStatus());
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		System.out.println(arg0.getName());
		System.out.println(arg0.getStatus());
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		
		System.out.println(arg0.getName());
		System.out.println(arg0.getStatus());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		
		System.out.println(" onTestFailedButWithinSuccessPercentage");
		System.out.println(arg0.getName());
		System.out.println(arg0.getStatus());
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		}

	@Override
	public void onStart(ITestContext arg0) {
		
		System.out.println(arg0.getStartDate());
		System.out.println(arg0.getAllTestMethods().toString());

	}

	@Override
	public void onFinish(ITestContext arg0) {
		System.out.println(arg0.getEndDate());
		System.out.println(arg0.getPassedTests());
		System.out.println(arg0.getFailedTests());
		}

}
