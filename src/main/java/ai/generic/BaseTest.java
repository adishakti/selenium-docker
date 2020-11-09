package ai.generic;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.Status;

import static org.assertj.core.api.SoftAssertions.assertSoftly;

public class BaseTest {
    ToolUtil utils = new ToolUtil();
    public WebDriver driver;
    protected WebDriverWait wait;

    @BeforeTest
    public void setupDriver(ITestContext ctx) throws MalformedURLException {
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
    
    public void sendKeys(WebElement e, String txt, String msg) {
        waitForVisibility(e);
        utils.log().info(msg);
        //ExtentReport.getTest().log(Status.INFO, msg);
        e.sendKeys(txt);
    }
    public void waitForVisibility(WebElement e) {
        WebDriverWait wait = new WebDriverWait(driver, ToolUtil.WAIT);
        wait.until(ExpectedConditions.visibilityOf(e));
    }
    public void click(WebElement e, String msg) {
        waitForVisibility(e);
        utils.log().info(msg);
        //ExtentReport.getTest().log(Status.INFO, msg);
        e.click();
    }
    
    public void scrollto(WebElement e, String msg) {
    	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", e);
        waitForVisibility(e);
    }
    
    public void cataloguesubmenu(WebElement menu,WebElement submenu,WebElement e,String msg) {
    	Actions action = new Actions(driver);
        action.moveToElement(menu).perform();
        action.moveToElement(submenu).perform();
        action.moveToElement(e).click().perform();
        //ExtentReport.getTest().log(Status.INFO, msg);
    }
    
    public void submenuelement(WebElement menu,WebElement e,String msg) {
    	Actions action = new Actions(driver);
        action.moveToElement(menu).perform();
        action.moveToElement(e).click().perform();
        //ExtentReport.getTest().log(Status.INFO, msg);
    }
    
    public void submenuexpander(WebElement menu,WebElement e,String msg) {
    	Actions action = new Actions(driver);
        action.moveToElement(menu).perform();
        action.moveToElement(e).click().perform();
        //ExtentReport.getTest().log(Status.INFO, msg);
    }

    public void asserttxt(String expected, String actual,String msg) {
        Assert.assertEquals(actual, expected);
        utils.log().info(msg);
        assertSoftly(softAssertions -> {
            softAssertions.assertThat(expected)
                    .isEqualToIgnoringCase(actual)
                    .doesNotContainAnyWhitespaces();
        });
        //ExtentReport.getTest().log(Status.INFO, msg);
    }

    public String getText(WebElement e, String msg) {
        waitForVisibility(e);
        String txt = e.getText();
        utils.log().info(msg + txt);
        //ExtentReport.getTest().log(Status.INFO, msg);
        return txt;
    }
    
    public void switchToWindow() {
    for (String Winhandle : driver.getWindowHandles()) 
    	{
		driver.switchTo().window(Winhandle);
		}
    }
    
    public void closeChatBOt(WebElement iframe,WebElement e, String msg) {
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iframe));
		e.click();
		driver.switchTo().parentFrame();
		//ExtentReport.getTest().log(Status.INFO, msg);
    }
}