package ai.dltk.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import ai.generic.BaseTest;

public class ResourcesPage extends BaseTest {

	@FindBy(xpath = "//button[normalize-space()='Documentation']")
	private WebElement documentation;

	@FindBy(xpath = "//mat-toolbar/div[3]/div[2]/button")
	private WebElement resources;

	@FindBy(xpath = "//a[normalize-space()='Terms of Services']")
	private WebElement TermsofServices;

	@FindBy(xpath = "//a[text()=' Machine learning ']")
	private WebElement MachineLearning;

	@FindBy(xpath = "//a[normalize-space()='Privacy Policy']")
	private WebElement PrivacyPolicy;

	@FindBy(xpath = "//a[normalize-space()='Cookie Policy']")
	private WebElement CookiePolicy;

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

	@FindBy(xpath = "//a[normalize-space()='Case Studies']")
	private WebElement CaseStudies;

	@FindBy(xpath = "//a[contains(text(),'Text Classification Quora')]")
	private WebElement TextClassification;

	@FindBy(xpath = "//a[contains(text(),'Predict Electricity Consumption using Time Series ')]")
	private WebElement PredictElectricity;

	@FindBy(xpath = "//a[contains(text(),'Predict Age and Gender using Convolutional Neural ')]")
	private WebElement PredictAge;

	@FindBy(xpath = "//a[contains(text(),'Demystify DNA Sequencing with Machine Learning and')]")
	private WebElement DemystifyDNA;

	@FindBy(xpath = "//a[normalize-space()='Community']")
	private WebElement Community;

	@FindBy(xpath = "//a[normalize-space()='Events']")
	private WebElement events;

	public ResourcesPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 30);
		PageFactory.initElements(driver, this);
	}

//	    public void goTo(){
//	        this.driver.get("https://cloud.dltk.ai/");
//	        driver.manage().window().maximize();
//	        this.wait.until(ExpectedConditions.visibilityOf(this.ResourcesPage));
//	    }
	public void documentation() {
		click(resources, "Resources");
		click(documentation, "documentation");
		scrolldown();
		click(MachineLearning, "Machine Learning");
		switchToWindow();
		click(Overview, " Overview");
		click(BeginnerGuide, "BeginnerGuide");
		click(Quickstart, "Quickstart");
		click(APIs, "APIs");
		click(SDK, "SDK");
		click(ReleaseNotes, "ReleaseNotes");
		TakeScreenshot("Resources>>Documentation>>Machine Learning");
	}

	public void CaseStudies() {
		click(resources, "Resources");
		click(CaseStudies, "Case Studies");
		switchToWindow();
		click(TextClassification, "TextClassification");
		click(PredictElectricity, "PredictElectricity");
		click(PredictAge, "PredictAge");
		click(DemystifyDNA, "DemystifyDNA");
	}

	public void Community() {
		click(resources, "Resources");
		click(Community, "Community");
		switchToWindow();
		TakeScreenshot("Resources>>Community");
	}

	public void events() {
		click(resources, "Resources");
		click(events, "Events");
		switchToWindow();
		TakeScreenshot("Resources>>Events");
	}
}