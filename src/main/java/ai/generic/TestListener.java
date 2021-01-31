package ai.generic;

import java.util.Arrays;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;

public class TestListener implements ITestListener {
    ToolUtil utils = new ToolUtil();


    public void onTestFailure(ITestResult result) {
    	String exceptionMessage = Arrays.toString(result.getThrowable().getStackTrace());
		ExtentReport.getTest().fail("<details><summary><b><font color=red>"+
									"Exception Occured, click to see details:"+"</font></b></summary>"+
    					exceptionMessage.replaceAll(",", "<br>")+"</details> \n");
        }
    @Override
    public void onTestStart(ITestResult result) {
        ExtentReport.startTest(result.getName(), result.getMethod().getDescription())
                .assignAuthor("Aditya");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
       String logText = "<b>Test Method "+result.getMethod().getMethodName()+ " Successful</b>";
       Markup m = MarkupHelper.createLabel(logText, ExtentColor.GREEN);
		ExtentReport.getTest().pass(m);
    }

    @Override
    public void onTestSkipped(ITestResult result) {
    	String logText = "<b>Test Method "+result.getMethod().getMethodName()+ " Skipped</b>";
        Markup m = MarkupHelper.createLabel(logText, ExtentColor.YELLOW);
		ExtentReport.getTest().skip(m);
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onStart(ITestContext context) {
        // TODO Auto-generated method stub

    }
    @Override
    public void onFinish(ITestContext context) {
	ExtentReport.EndTest();
    }
}
