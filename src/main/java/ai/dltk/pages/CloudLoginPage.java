package ai.dltk.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ai.generic.BaseTest;

public class CloudLoginPage extends BaseTest {

	@FindBy(xpath = "//div[@class='landing-main-heading']")
	private WebElement WelcomeMessage;

	@FindBy(xpath = "//mat-toolbar/div[4]/div[1]/button")
	private WebElement Login;

	@FindBy(xpath = "//input[@id='mat-input-8']")
	private WebElement userName;

	@FindBy(xpath = "//input[@id='mat-input-9']")
	private WebElement password;

	@FindBy(xpath = "//button[@class='mat-focus-indicator mat-flat-button mat-button-base _mat-animation-noopable']")
	private WebElement loginButton;

	public CloudLoginPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 30);
		PageFactory.initElements(driver, this);
	}

	public void goTo() {
		this.driver.get("https://dev-angular.dltk.ai");
		driver.manage().window().maximize();
		waitForLoad();
		waitForLoad();
		this.wait.until(ExpectedConditions.visibilityOf(this.WelcomeMessage));
	}

	public void login(String userName, String password) {
		click(Login, "Login Link");
		sendKeys(this.userName, userName, "Username");
		sendKeys(this.password, password, "Password");
//        assertSoftly(softAssertions -> {
//            softAssertions.assertThat(password)
//                    .hasSize(12)
//                    .doesNotContainAnyWhitespaces();
//        });

		click(loginButton, "Login Button");
		waitForLoad();
		waitForLoad();
		waitForLoad();
		waitForLoad();
		TakeScreenshot("Landed to DLTK-AI Home Page");
	}

}