package ai.generic;

import static org.assertj.core.api.SoftAssertions.assertSoftly;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest implements ITestListener {
	ToolUtil utils = new ToolUtil();
	public WebDriver driver;
	protected WebDriverWait wait;

	@BeforeTest
	public void setupDriver() {
		WebDriverManager.chromedriver().setup();
		this.driver = new ChromeDriver();
	}

//    public void setupDriver(ITestContext ctx) throws MalformedURLException {
//        String host = "localhost";
//        DesiredCapabilities dc;
//
//        if(System.getProperty("BROWSER") != null &&
//                System.getProperty("BROWSER").equalsIgnoreCase("firefox")){
//            dc = DesiredCapabilities.firefox();
//        }else{
//            dc = DesiredCapabilities.chrome();
//        }
//
//        if(System.getProperty("HUB_HOST") != null){
//            host = System.getProperty("HUB_HOST");
//        }
//
//        String testName = ctx.getCurrentXmlTest().getName();
//
//        String completeUrl = "http://" + host + ":4444/wd/hub";
//        dc.setCapability("name", testName);
//        this.driver = new RemoteWebDriver(new URL(completeUrl), dc);
//    }

	@AfterTest
	public void quitDriver() {
		this.driver.quit();
	}

	public void sendKeys(WebElement e, String txt, String msg) {
		waitForVisibility(e);
		utils.log().info(msg);
		e.sendKeys(txt);
		ExtentReport.getTest().log(Status.INFO, "Written " + txt + " on " + msg,
				MediaEntityBuilder.createScreenCaptureFromBase64String(getBase64()).build());
		// ExtentReport.getTest().log(Status.INFO, "Written " + txt + " on " + msg);
	}

	public void waitForVisibility(WebElement e) {
		WebDriverWait wait = new WebDriverWait(driver, ToolUtil.WAIT);
		wait.until(ExpectedConditions.visibilityOf(e));
	}

	public void navigate(String url) {
		driver.navigate().to(url);
		ExtentReport.getTest().log(Status.INFO, "Navigated to: " + url);
		waitForLoad();
	}

	public void click(WebElement e, String msg) {
		waitForVisibility(e);
		utils.log().info(msg);
		e.click();
		ExtentReport.getTest().log(Status.INFO, "Click on: " + msg,
				MediaEntityBuilder.createScreenCaptureFromBase64String(getBase64()).build());
		// ExtentReport.getTest().log(Status.INFO, "Click on: " + msg);
		// waitForLoad();
	}

	public void switchTo() {
		driver.switchTo().frame(0);
		ExtentReport.getTest().log(Status.INFO, "Switched to inner frame",
				MediaEntityBuilder.createScreenCaptureFromBase64String(getBase64()).build());
		// ExtentReport.getTest().log(Status.INFO, "Click on: " + msg);
		waitForLoad();
	}

	public void waitForLoad() {
		ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
			@Override
			public Boolean apply(WebDriver driver) {
				return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString()
						.equals("complete");
			}
		};
		try {
			Thread.sleep(1000);
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(expectation);
		} catch (Throwable error) {
			Assert.fail("Timeout waiting for Page Load Request to complete.");
		}
	}

	public void scrollto(WebElement e, String msg) {
		waitForLoad();
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(false);", e);
		// waitForVisibility(e);
		ExtentReport.getTest().log(Status.INFO, "Scroll to: " + msg,
				MediaEntityBuilder.createScreenCaptureFromBase64String(getBase64()).build());
		// ExtentReport.getTest().log(Status.INFO, "Scroll to: " + msg);
	}

	public void scrollandClick(WebElement e, String msg) {
		int x = 1;
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		while (x < 28) {
			executor.executeScript("window.scrollTo(0, document.body.scrollHeight);");
			waitForLoad();
			waitForLoad();
			waitForLoad();
			x++;
		}
		executor.executeScript("arguments[0].scrollIntoView(false);", e);
		e.click();
		ExtentReport.getTest().log(Status.INFO, "Scroll and click: " + msg,
				MediaEntityBuilder.createScreenCaptureFromBase64String(getBase64()).build());
		// ExtentReport.getTest().log(Status.INFO, "Scroll and click: " + msg);
	}

	public void scrolldown() {
		waitForLoad();
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)");
		ExtentReport.getTest().log(Status.INFO, "Scroll Down");
		waitForLoad();
		waitForLoad();
	}

	public void TakeScreenshot(String msg) {
		waitForLoad();
		ExtentReport.getTest().log(Status.INFO, "Screenshot of page: " + msg,
				MediaEntityBuilder.createScreenCaptureFromBase64String(getBase64()).build());
	}

	public void cataloguesubmenu(WebElement menu, WebElement submenu, WebElement e, String msg) {
		waitForLoad();
		Actions action = new Actions(driver);
		action.moveToElement(menu).click().perform();
		waitForLoad();
		action.moveToElement(submenu).click().perform();
		waitForLoad();
		action.moveToElement(e).click().perform();
		ExtentReport.getTest().log(Status.INFO, "Click on Submenu Item: " + msg,
				MediaEntityBuilder.createScreenCaptureFromBase64String(getBase64()).build());
		// ExtentReport.getTest().log(Status.INFO, "Click on Submenu Item: " + msg);
	}

	public void submenuelement(WebElement menu, WebElement e, String msg) {
		Actions action = new Actions(driver);
		action.moveToElement(menu).perform();
		action.moveToElement(e).click().perform();
		ExtentReport.getTest().log(Status.INFO, "Click on Submenu Item: " + msg,
				MediaEntityBuilder.createScreenCaptureFromBase64String(getBase64()).build());
		// ExtentReport.getTest().log(Status.INFO, "Click on Submenu Item: " + msg);
	}

	public void submenuexpander(WebElement menu, WebElement e, String msg) {
		waitForLoad();
		Actions action = new Actions(driver);
		action.moveToElement(menu).click().perform();
		waitForLoad();
		action.moveToElement(e).click().perform();
		ExtentReport.getTest().log(Status.INFO, "Click on Submenu Item: " + msg,
				MediaEntityBuilder.createScreenCaptureFromBase64String(getBase64()).build());
		// ExtentReport.getTest().log(Status.INFO, "Click on Submenu Item: " + msg);
	}

	public void asserttxt(String expected, String actual, String msg) {
		Assert.assertEquals(actual, expected);
		utils.log().info(msg);
		assertSoftly(softAssertions -> {
			softAssertions.assertThat(expected).isEqualToIgnoringCase(actual);
			// .doesNotContainAnyWhitespaces();
		});
		ExtentReport.getTest().log(Status.INFO,
				"Assertion on " + msg + " Expected String is " + expected + " and Actual String is " + actual,
				MediaEntityBuilder.createScreenCaptureFromBase64String(getBase64()).build());
		// ExtentReport.getTest().log(Status.INFO,"Assertion on " + msg + " Expected
		// String is " + expected + " and Actual String is " + actual);
	}

	public void uploadFile(WebElement e, String file) {
		e.sendKeys(System.getProperty("user.dir") + "/testdata/" + file);
		ExtentReport.getTest().log(Status.INFO, "Uploaded file " + file,
				MediaEntityBuilder.createScreenCaptureFromBase64String(getBase64()).build());
	}

	public String getText(WebElement e, String msg) {
		waitForLoad();
		waitForVisibility(e);
		String txt = e.getText();
		utils.log().info(msg + txt);
		ExtentReport.getTest().log(Status.INFO, "Get text from: " + msg,
				MediaEntityBuilder.createScreenCaptureFromBase64String(getBase64()).build());
		// ExtentReport.getTest().log(Status.INFO, "Get text from: "+msg);
		return txt;
	}

	public void switchToWindow() {
		for (String Winhandle : driver.getWindowHandles()) {
			driver.switchTo().window(Winhandle);
		}
	}

	public void closeChatBOt(WebElement iframe, WebElement e, String msg) {
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iframe));
		e.click();
		driver.switchTo().parentFrame();
		ExtentReport.getTest().log(Status.INFO, "Click on " + msg,
				MediaEntityBuilder.createScreenCaptureFromBase64String(getBase64()).build());
		// ExtentReport.getTest().log(Status.INFO, "Click on " + msg);
	}

	public String getBase64() {
		return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
	}
}