package ai.dltk.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import ai.generic.BaseTest;

public class CatalogPage extends BaseTest {

	@FindBy(xpath = "//mat-toolbar/div[3]/div[1]/button")
	private WebElement catalog;

	@FindBy(xpath = "//button[normalize-space()='Computer Vision']")
	private WebElement ComputerVision;

	@FindBy(xpath = "//a[@class='btn btn-primary btn-lg']")
	private WebElement Documentation;

	@FindBy(xpath = "//a[normalize-space()='Coming Soon']")
	private WebElement ComingSoon;

	@FindBy(xpath = "//span[@class='listFixed active']")
	private WebElement Overview;

	@FindBy(xpath = "//span[@class='listFixed'][normalize-space()=\"Beginner's Guide\"]")
	private WebElement BeginnerGuide;

	@FindBy(xpath = "//span[@class='listFixed'][normalize-space()='Quickstart']")
	private WebElement Quickstart;

	@FindBy(xpath = "//span[@class='listFixed'][normalize-space()='APIs']")
	private WebElement APIs;

	@FindBy(xpath = "//span[@class='listFixed'][normalize-space()='SDK']")
	private WebElement SDK;

	@FindBy(xpath = "//span[@class='listFixed'][normalize-space()='Release Notes']")
	private WebElement ReleaseNotes;

	@FindBy(xpath = "//button[normalize-space()='Natural Language Processing']")
	private WebElement Naturallanguageprocessing;

	@FindBy(xpath = "//button[normalize-space()='Content Inspector']")
	private WebElement Contentinspector;

	@FindBy(xpath = "//button[normalize-space()='Machine Learning']")
	private WebElement Machinelearning;

	@FindBy(xpath = "//button[normalize-space()='Emotions']")
	private WebElement Emotions;

	@FindBy(xpath = "//button[normalize-space()='Chatbot']")
	private WebElement Chatbot;

	@FindBy(xpath = "//button[normalize-space()='AI Suite']")
	private WebElement AISuite;

	@FindBy(xpath = "//button[normalize-space()='Analytics']")
	private WebElement Analytics;

	@FindBy(xpath = "//button[normalize-space()='IOT']")
	private WebElement IOT;

	@FindBy(xpath = "//button[normalize-space()='Data Dockyard']")
	private WebElement DataPlayground;

	@FindBy(xpath = "//button[normalize-space()='Conversation']")
	private WebElement Conversation;

	@FindBy(xpath = "//button[normalize-space()='IoT Platform']")
	private WebElement IoTPlatform;

	public CatalogPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 30);
		PageFactory.initElements(driver, this);
	}

//		public void goTo(){
//	        this.driver.get("https://cloud.dltk.ai/");
//	        driver.manage().window().maximize();
//	        this.wait.until(ExpectedConditions.visibilityOf(this.WelcomeMessage));
//	    }

	public void ComputerVision() {
		cataloguesubmenu(catalog, AISuite, ComputerVision, "Computer Vision");
		click(Documentation, "Documentation");
		// click(ComingSoon, "ComingSoon");
		switchToWindow();
		click(Overview, " Overview");
		click(BeginnerGuide, "BeginnerGuide");
		click(Quickstart, "Quickstart");
		click(APIs, "APIs");
		waitForLoad();
		click(SDK, "SDK");
		click(ReleaseNotes, "ReleaseNotes");
		waitForLoad();
		TakeScreenshot("CV Screenshot");
	}

	public void Naturallanguageprocessing() {
		cataloguesubmenu(catalog, AISuite, Naturallanguageprocessing, "Natural Language Processing");
		click(Documentation, "Documentation");
		switchToWindow();
		click(Overview, " Overview");
		click(BeginnerGuide, "BeginnerGuide");
		click(Quickstart, "Quickstart");
		click(APIs, "APIs");
		waitForLoad();
		click(SDK, "SDK");
		click(ReleaseNotes, "ReleaseNotes");
		waitForLoad();
		TakeScreenshot("NLP Screenshot");
	}

	public void Machinelearning() {
		cataloguesubmenu(catalog, AISuite, Machinelearning, "Machine Learning");
		click(Documentation, "Documentation");
		switchToWindow();
		// click(ComingSoon, "ComingSoon");
		click(Overview, " Overview");
		click(BeginnerGuide, "BeginnerGuide");
		click(Quickstart, "Quickstart");
		click(APIs, "APIs");
		waitForLoad();
		click(SDK, "SDK");
		click(ReleaseNotes, "ReleaseNotes");
		waitForLoad();
		TakeScreenshot("Machine Learning Screenshot");
	}

	public void Contentinspector() {
		cataloguesubmenu(catalog, AISuite, Contentinspector, "Content Inspector");
		// click(ComingSoon, "ComingSoon");

	}

	public void Emotions() {
		cataloguesubmenu(catalog, AISuite, Emotions, "Emotions");
		// click(ComingSoon, "ComingSoon");

	}

	public void Chatbot() {
		cataloguesubmenu(catalog, AISuite, Chatbot, "Chatbot");
		// click(Documentation, "Documentation");

	}

	public void Conversation() {
		cataloguesubmenu(catalog, AISuite, Conversation, "Conversation");
		// click(ComingSoon, "ComingSoon");

	}

	public void DataPlayground() {
		cataloguesubmenu(catalog, Analytics, DataPlayground, "Data Dockyard");
		// click(ComingSoon, "ComingSoon");
	}

	public void IoTPlatform() {
		cataloguesubmenu(catalog, IOT, IoTPlatform, "IOT Platform");
		// submenuelement(catalog, IoTPlatform, "IoT Platform");
		// click(ComingSoon, "ComingSoon");
	}
}
