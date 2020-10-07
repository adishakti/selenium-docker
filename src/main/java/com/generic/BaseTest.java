package com.generic;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;

public class BaseTest {
    ToolUtil utils = new ToolUtil();
    protected WebDriver driver;
    protected WebDriverWait wait;

    @BeforeTest
    public void setupDriver(ITestContext ctx) throws MalformedURLException {
        // BROWSER => chrome / firefox
        // HUB_HOST => localhost / 10.0.1.3 / hostname

        String host = "localhost";
        DesiredCapabilities dc;

        if(System.getProperty("BROWSER") != null &&
                System.getProperty("BROWSER").equalsIgnoreCase("firefox")){
            dc = DesiredCapabilities.firefox();
        }else{
            dc = DesiredCapabilities.chrome();
        }

        if(System.getProperty("HUB_HOST") != null){
            host = System.getProperty("HUB_HOST");
        }

        String testName = ctx.getCurrentXmlTest().getName();

        String completeUrl = "http://" + host + ":4444/wd/hub";
        dc.setCapability("name", testName);
        this.driver = new RemoteWebDriver(new URL(completeUrl), dc);
    }

    @AfterTest
    public void quitDriver(){
        this.driver.quit();
    }
    public static String getScreenshotName(String methodName) {
       Date d = new Date();
        String fileName = methodName + "_" + d.toString().replace(" ", "_") + ".png";
        return fileName;
    }
    public void sendKeys(WebElement e, String txt, String msg) {
        waitForVisibility(e);
        utils.log().info(msg);
        ExtentReport.getTest().log(Status.INFO, msg);
        e.sendKeys(txt);
    }
    public void waitForVisibility(WebElement e) {
        WebDriverWait wait = new WebDriverWait(driver, ToolUtil.WAIT);
        wait.until(ExpectedConditions.visibilityOf(e));
    }
    public void click(WebElement e, String msg) {
        waitForVisibility(e);
        utils.log().info(msg);
        ExtentReport.getTest().log(Status.INFO, msg);
        e.click();
    }

    public void asserttxt(String expected, String actual,String msg) {
        Assert.assertEquals(actual, expected);
        utils.log().info(msg);
        ExtentReport.getTest().log(Status.INFO, msg);
    }

    public String getText(WebElement e, String msg) {
        waitForVisibility(e);
        String txt = e.getText();
        utils.log().info(msg + txt);
        ExtentReport.getTest().log(Status.INFO, msg);
        return txt;
    }


}
