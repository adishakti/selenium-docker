package ai.generic;

import java.io.File;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
	
	private static ExtentReports extentReports;
	private static ExtentTest extentTest;
    private static ExtentHtmlReporter extentHtmlReporter;

	
	public static ExtentReports createInstance() {
		String fileName = getReportName();
		String directory = System.getProperty("user.dir")+ "/reports/";
		new File(directory).mkdirs();
		String path = directory + fileName;
		extentHtmlReporter = new ExtentHtmlReporter(path);
        extentHtmlReporter.config().setEncoding("utf-8");
        extentHtmlReporter.config().setDocumentTitle("Automation Reports");
        extentHtmlReporter.config().setReportName("Qubit Automation Test Result");
        extentHtmlReporter.config().setTheme(Theme.DARK);
        extentReports = new ExtentReports();
        extentReports.setSystemInfo("Organization", "QubitAI");
        extentReports.setSystemInfo("Browser", "Chrome");
        extentReports.attachReporter(extentHtmlReporter);
        return extentReports;
	}

	public static String getReportName( ) {
		Date d = new Date();
		String fileName = "QubitAIAutomationReport_"+ d.toString().replace(":", "_").replace(" ", "_")+".html";
		return fileName;
	}
	public static ExtentReports getInstance( ) {
		if (extentReports==null)
		{
			createInstance();
		}
		return extentReports;
	}
}
