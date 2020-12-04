package ai.generic;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ExtentReport {
    static ExtentReports extent;
    final static String filePath = "Extent.html";
    static Map<Integer, ExtentTest> extentTestMap = new HashMap();
    
    public synchronized static ExtentReports getReporter() {
        if (extent == null) {
            String fileName = getReportName();
            String directory = System.getProperty("user.dir")+ "/reports/";
            new File(directory).mkdirs();
            String Path = directory + fileName;

        	ExtentHtmlReporter html = new ExtentHtmlReporter(Path);
        	html.config().setDocumentTitle("DLTK Framework");
        	html.config().setReportName("DLTK Website Automation");
        	html.config().setTheme(Theme.DARK);
            extent = new ExtentReports();
            extent.setSystemInfo("Organization", "QubitAI");
            extent.setSystemInfo("Browser", "Chrome");
            extent.attachReporter(html);
        }
        
        return extent;
    }
    
    public static synchronized ExtentTest getTest() {
        return (ExtentTest) extentTestMap.get((int) (long) (Thread.currentThread().getId()));
    }

    public static synchronized void EndTest() {
        extent.flush();
    }

    public static synchronized ExtentTest startTest(String testName, String desc) {
        ExtentTest test = getReporter().createTest(testName, desc);
        extentTestMap.put((int) (long) (Thread.currentThread().getId()), test);
        return test;
    }
    public static String getReportName( ) {
        Date d = new Date();
        String fileName = "QubitAIAutomationReport_"+ d.toString().replace(":", "_").replace(" ", "_")+".html";
        return fileName;
    }
}
