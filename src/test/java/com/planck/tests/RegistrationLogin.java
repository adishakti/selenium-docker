package com.planck.tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.generic.BaseTest;
import com.newtours.pages.FindFlightPage;
import com.newtours.pages.FlightConfirmationPage;
import com.newtours.pages.FlightDetailsPage;
import com.newtours.pages.RegistrationConfirmationPage;
import com.planckai.pages.RegistrationPage;
import org.testng.Assert;
import org.testng.annotations.*;

public class RegistrationLogin extends BaseTest {

    ExtentReports extentReports;
    ExtentTest extentTest;
    ExtentHtmlReporter extentHtmlReporter;
    private String noOfPassengers;
    private String expectedPrice;

    @BeforeClass
    public void setExtentReport() {
        extentHtmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/QubitAITestingReport.html");
        extentHtmlReporter.config().setEncoding("utf-8");
        extentHtmlReporter.config().setDocumentTitle("Automation Reports");
        extentHtmlReporter.config().setReportName("Qubit Automation Test Result");
        extentHtmlReporter.config().setTheme(Theme.DARK);
        extentReports = new ExtentReports();
        extentReports.setSystemInfo("Organization", "QubitAI");
        extentReports.setSystemInfo("Browser", "Chrome");
        extentReports.attachReporter(extentHtmlReporter);
    }

    @BeforeTest
    @Parameters({"noOfPassengers", "expectedPrice"})
    public void setupParameters(String noOfPassengers, String expectedPrice) {
        this.noOfPassengers = noOfPassengers;
        this.expectedPrice = expectedPrice;
    }

    @Test
    public void registrationPage() {
        ExtentTest logger = extentReports.createTest("registration");
        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.goTo();
        registrationPage.enterUserDetails("Test","Test");
        registrationPage.validatepopup();
    }

    @Test(dependsOnMethods = "registrationPage")
    public void emailConfirmation() {
        RegistrationConfirmationPage registrationConfirmationPage = new RegistrationConfirmationPage(driver);
        registrationConfirmationPage.goToFlightDetailsPage();
        extentReports.flush();
    }

    @Test(dependsOnMethods = "registrationConfirmationPage")
    public void flightDetailsPage() {
        ExtentTest logger2 = extentReports.createTest("find flight details");
        FlightDetailsPage flightDetailsPage = new FlightDetailsPage(driver);
        flightDetailsPage.selectPassengers(noOfPassengers);
        flightDetailsPage.goToFindFlightsPage();
        logger2.log(Status.INFO, "go to find flights");
        extentReports.flush();
    }

    @Test(dependsOnMethods = "flightDetailsPage")
    public void findFlightPage() {
        ExtentTest logger3 = extentReports.createTest("find flights");
        FindFlightPage findFlightPage = new FindFlightPage(driver);
        findFlightPage.submitFindFlightPage();
        findFlightPage.goToFlightConfirmationPage();
        logger3.log(Status.INFO, "search flights");
        extentReports.flush();
    }

    @Test(dependsOnMethods = "findFlightPage")
    public void flightConfirmationPage() {
        ExtentTest logger4 = extentReports.createTest("flight confirmation page");
        FlightConfirmationPage flightConfirmationPage = new FlightConfirmationPage(driver);
        String actualPrice = flightConfirmationPage.getPrice();
        Assert.assertEquals(actualPrice, expectedPrice);
        if (actualPrice.equalsIgnoreCase(expectedPrice)) {
            logger4.pass("Expected and actual flight price is same");
        } else {
            logger4.fail("Expected and actual flight price is not same");
        }
        extentReports.flush();
    }

    @AfterClass
    public void flushExtentReport() {
        extentReports.flush();
    }
}
