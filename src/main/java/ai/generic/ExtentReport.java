package ai.generic;

import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Protocol;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport {
	static ExtentReports extent;
	static Map<Integer, ExtentTest> extentTestMap = new HashMap();

	public synchronized static ExtentReports getReporter() {
		if (extent == null) {
			String fileName = getReportName();
			String directory = System.getProperty("user.dir") + "/reports/";
			new File(directory).mkdirs();
			String Path = directory + fileName;
			ExtentSparkReporter sparkReporter = new ExtentSparkReporter(Path);
			sparkReporter.config().setDocumentTitle("Extent Report_Aditya Verma");
			sparkReporter.config().setReportName("Extent Report_Aditya Verma");
			sparkReporter.config().setTimeStampFormat("HH:mm:ss");
			sparkReporter.config().setEncoding("utf-8");
			sparkReporter.config().setProtocol(Protocol.HTTPS);
			sparkReporter.config().setTheme(Theme.DARK);
			extent = new ExtentReports();
			extent.attachReporter(sparkReporter);
			extent.setReportUsesManualConfiguration(true);
			extent.setSystemInfo("Browser", "Chrome");
			extent.setSystemInfo("OS", System.getProperty("os.name"));
			extent.setSystemInfo("OS Version", System.getProperty("os.version"));
			extent.setSystemInfo("OS Architecture", System.getProperty("os.arch"));
			extent.setSystemInfo("OS Bit", System.getProperty("sun.arch.data.model"));
			extent.setSystemInfo("JAVA Version", System.getProperty("java.version"));
			extent.setSystemInfo("Author", "Aditya Verma");
		}

		return extent;
	}

	public static synchronized ExtentTest getTest() {
		return extentTestMap.get((int) (Thread.currentThread().getId()));
	}

	public static synchronized void EndTest() {
		extent.flush();
	}

	public static synchronized ExtentTest startTest(String testName, String desc) {
		ExtentTest test = getReporter().createTest(testName, desc);
		extentTestMap.put((int) (Thread.currentThread().getId()), test);
		return test;
	}

	public static String getReportName() {
		Date d = new Date();
		String fileName = "QubitAIAutomationReport_" + d.toString().replace(":", "_").replace(" ", "_") + ".html";
		return fileName;
	}
}
