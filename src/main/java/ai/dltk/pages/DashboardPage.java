package ai.dltk.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import ai.generic.BaseTest;

public class DashboardPage extends BaseTest {

	@FindBy(xpath = "//mat-toolbar/div[3]/div[3]/button")
	private WebElement Console;

	@FindBy(xpath = "//div[@class='branding']/img")
	private WebElement HomeLink;

	@FindBy(xpath = "//i[@class='ti-home menu-icon']")
	private WebElement Dashboard;

	@FindBy(xpath = "//a[contains(text(),'API Explorer')]")
	private WebElement APIExplorer;

	@FindBy(xpath = "//a[contains(text(),'Documentation')]")
	private WebElement Documentation;

	@FindBy(xpath = "//div[@class='sidebar-hold']/div[1]/div")
	private WebElement sideBar;

	@FindBy(xpath = "//h1")
	private WebElement pagenotfound;

	public DashboardPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 30);
		PageFactory.initElements(driver, this);
	}

	public void Dashboard() {
		click(Console, "Console");
		click(sideBar, "sideBar Compact View");
		TakeScreenshot("Console Dashboard Compact View");
	}
}