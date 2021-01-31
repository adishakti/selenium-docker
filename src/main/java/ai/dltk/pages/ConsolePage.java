/**
 *
 */
package ai.dltk.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ai.generic.BaseTest;

/**
 * @author AdityaVerma
 *
 */
public class ConsolePage extends BaseTest {

	@FindBy(xpath = "//p[normalize-space()='Helping to Build AI For']")
	private WebElement WelcomeMessage;

	@FindBy(xpath = "//mat-toolbar/div[3]/div[3]/button")
	private WebElement Console;

	@FindBy(xpath = "//div[@id='scroll-area']//div[@class='branding']/img")
	private WebElement HomeLink;

	@FindBy(xpath = "//div[@class='sidenav-hold']//li[8]//a")
	private WebElement menu;

	@FindBy(xpath = "//mat-card[@class='mat-card mat-focus-indicator _mat-animation-noopable']//mat-card-content/div/div[1]//a")
	private WebElement APIExplorer;

	@FindBy(xpath = "//a[contains(text(),'Documentation')]")
	private WebElement Doc;

	@FindBy(xpath = "//ul[@class='sidenav']/li[12]/div/ul/li[1]/a")
	private WebElement FAQ;

	@FindBy(xpath = "//ul[@class='sidenav']/li[12]/div/ul/li[2]/a")
	private WebElement Support;

	@FindBy(xpath = "//ul[@class='sidenav']/li[12]//a")
	private WebElement HelpSupport;

	@FindBy(xpath = "//div[@class='sidenav-hold']/ul/li[11]//a")
	private WebElement profilesidebar;

	@FindBy(xpath = "//div[@class='sidenav-hold']/ul/li[10]//a")
	private WebElement jupiterhub;

	@FindBy(xpath = "//h1")
	private WebElement pagenotfound;

	@FindBy(xpath = "//span[normalize-space()='Profile']")
	private WebElement Profile;

	@FindBy(xpath = "//mat-toolbar[@class='mat-toolbar topbar mat-bg-card mat-toolbar-single-row']/button[4]")
	private WebElement menuicon;

	@FindBy(xpath = "//span[normalize-space()='Sign out']")
	private WebElement Logout;

	@FindBy(xpath = "//app-header-side/mat-toolbar//button[@mattooltip='Notifications']")
	private WebElement notificationDropdown;

	@FindBy(xpath = "//div[@class='sidenav-hold']/ul/li[9]//a")
	private WebElement Storage;

	public ConsolePage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 30);
		PageFactory.initElements(driver, this);
	}

	public void goTo() {
		this.driver.get("https://Cloud.dltk.ai/");
		driver.manage().window().maximize();
		this.wait.until(ExpectedConditions.visibilityOf(this.WelcomeMessage));
	}

	public void Apiexplorer() {
//		click(HomeLink, "Home Link");
		click(Console, "Console");
		click(APIExplorer, "APIExplorer");
	}

	public void DataManagement() {
//		click(HomeLink, "Home Link");
		click(Console, "Console");
		click(Storage, "Data Management");
		// click(Doc, "Doc");
	}

	public void Support() {
//		click(HomeLink, "Home Link");
		click(Console, "Console");
//		click(menu, "menu");
		click(HelpSupport, "Help Support");
		click(FAQ, "FAQ");
		// submenuexpander(HelpSupport, FAQ, "FAQ");
	}

	public void FAQ() {
//		click(HomeLink, "Home Link");
		click(Console, "Console");
//		click(menu, "menu");
		click(HelpSupport, "Help Support");
		click(Support, "Support");
		// submenuexpander(HelpSupport, Support, "Support");
	}

	public void Profile() {
//		click(HomeLink, "Home Link");
		click(Console, "Console");
		click(profilesidebar, "Profile");
	}

	public void jupiter() {
//		click(HomeLink, "Home Link");
		click(Console, "Console");
		click(jupiterhub, "jupiterhub");
		switchTo();
		String pageError = getText(pagenotfound, "Page Not Found");
		asserttxt("", pageError, "Jupiterhub page");
	}

	public void Storage() {
		click(Console, "Console");
		click(Storage, "Storage");
	}

	public void notificationDropdown() {
//		click(HomeLink, "Home Link");
		click(Console, "Console");
		click(notificationDropdown, "notificationDropdown");

	}

	public void Logout() {
		click(Console, "Console");
		click(menuicon, "menuicon");
		click(Logout, "Logout");
	}
}