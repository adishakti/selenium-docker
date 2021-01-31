package ai.dltk.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import ai.generic.BaseTest;

public class ConsoleCatalogpage extends BaseTest {

	@FindBy(xpath = "//mat-toolbar/div[3]/div[3]/button")
	private WebElement Console;

	@FindBy(xpath = "//div[@class='branding']/img")
	private WebElement HomeLink;

	@FindBy(xpath = "//ul[@class='sidenav']/li[7]/div/a")
	private WebElement catalogue;

	@FindBy(xpath = "//mat-toolbar[@class='mat-toolbar topbar mat-bg-card mat-toolbar-single-row']/mat-form-field/div/div[1]")
	private WebElement dropdownshow;

	@FindBy(xpath = "//div[@class='cdk-overlay-pane']//mat-option[@id='mat-option-0']")
	private WebElement firstoption;

	@FindBy(xpath = "//ul[@class='sidenav']/li[7]/div/ul/li[1]/a")
	private WebElement ComputerVision;

	@FindBy(xpath = "//div[contains(text(),'Face Detection')]")
	private WebElement faceDetection;

	@FindBy(xpath = "//div[contains(text(),'Image Classification')]")
	private WebElement imageClassification;

	@FindBy(xpath = "//app-app-info/mat-card/div[1]/div[5]//button")
	private WebElement Explore;

	@FindBy(xpath = "//div[@class='ng-star-inserted']//span")
	private WebElement CVExplore;

	@FindBy(xpath = "//div[@for='objectC']//input[@value='1']")
	private WebElement Tensorflow;

	@FindBy(xpath = "//div[@for='posC']/div[1]/input")
	private WebElement posSpacy;

	@FindBy(xpath = "//div[@for='posC']/div[2]/input")
	private WebElement posWatson;

	@FindBy(xpath = "//div[@class='global-font chk-font ng-star-inserted'][1]/input[@value='1']")
	private WebElement opencv;

	@FindBy(xpath = "//div[@class='chk-font global-font ng-star-inserted'][1]/input[@value='1']")
	private WebElement ibmwatson;

	@FindBy(xpath = "//div[@class='chk-font global-font ng-star-inserted'][2]/input[@value='2']")
	private WebElement imageTensorflow;

	@FindBy(xpath = "//div[@class='global-font chk-font ng-star-inserted'][2]/input[@value='2']")
	private WebElement MSAzure;

	@FindBy(xpath = "//div[@for='objectC']//input[@value='2']")
	private WebElement Azure;

	@FindBy(xpath = "//div[contains(text(),'AZURE')]")
	private WebElement Azuretext;

	@FindBy(xpath = "//div[@class='result-heading'][normalize-space()='Microsoft Azure']")
	private WebElement FaceAzuretext;

	@FindBy(xpath = "//div[@class='border file-upload']/input[@id='file']")
	private WebElement chooseFile;

	@FindBy(xpath = "//button[@name='pos1']")
	private WebElement posTryIt;

	@FindBy(xpath = "//button[@name='objectDect']")
	private WebElement submit;

	@FindBy(xpath = "//span[normalize-space()='Submit']")
	private WebElement facesubmit;

	@FindBy(xpath = "//div[@class='ng-star-inserted']/div[normalize-space()='Result:']")
	private WebElement result;

	@FindBy(xpath = "//ul[@class='sidenav']/li[7]/div/ul/li[2]/a")
	private WebElement NLP;

	@FindBy(xpath = "//ul[@class='sidenav']/li[7]/div/ul/li[3]/a")
	private WebElement ML;

	public ConsoleCatalogpage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 30);
		PageFactory.initElements(driver, this);
	}

	public void ComputerVision() {
		click(Console, "Console");
		click(catalogue, "catalogue");
		click(ComputerVision, "ComputerVision");
		click(dropdownshow, "dropdownshow");
		click(firstoption, "First Option");
		click(Explore, "Explore");
	}

	public void ObjectDetection() {
		// click(catalogue, "catalogue");
		click(catalogue, "catalogue");
		click(ComputerVision, "ComputerVision");
		click(CVExplore, "Explore");
		click(Tensorflow, "Tensorflow");
		click(Azure, "Azure");
		uploadFile(chooseFile, "Cat.JPG");
		scrolldown();
		click(submit, "submit");
		waitForLoad();
		waitForLoad();
		click(result, "Result");
		scrolldown();
		scrolldown();
		click(Azuretext, "Azure text");
	}

	public void POS() {
		// click(catalogue, "catalogue");
		click(catalogue, "catalogue");
		click(NLP, "Natural Language Processing");
		click(CVExplore, "Explore");
		click(posSpacy, "Spacy");
		click(posWatson, "Watson");
		click(posTryIt, "Try It");
		waitForLoad();
		scrolldown();
		TakeScreenshot("Reults of POS");
	}

	public void faceDetection() {
		// click(catalogue, "catalogue");
		click(catalogue, "catalogue");
		click(ComputerVision, "ComputerVision");
		click(CVExplore, "Explore");
		click(faceDetection, "Face Detection");
		click(opencv, "opencv");
		click(MSAzure, "MS-Azure");
		uploadFile(chooseFile, "steve.jpg");
		scrolldown();
		click(facesubmit, "submit");
		waitForLoad();
		waitForLoad();
		click(result, "Result");
		waitForLoad();
		scrolldown();
		scrolldown();
		click(FaceAzuretext, "Azure text");
	}

	public void imageClassification() {
		// click(catalogue, "catalogue");
		click(catalogue, "catalogue");
		click(ComputerVision, "ComputerVision");
		click(CVExplore, "Explore");
		click(imageClassification, "Image Classification");
		click(ibmwatson, "IBM Watson");
		click(imageTensorflow, "Tensorflow");
		uploadFile(chooseFile, "Cat.JPG");
		scrolldown();
		click(facesubmit, "submit");
		waitForLoad();
		waitForLoad();
		click(result, "Result");
		waitForLoad();
		scrolldown();
		scrolldown();
		click(FaceAzuretext, "Azure text");
	}

	public void Naturallanguageprocessing() {
		click(Console, "Console");
		click(catalogue, "catalogue");
		click(NLP, "NLP");
		click(dropdownshow, "dropdownshow");
		click(firstoption, "First Option");
		click(Explore, "Explore");
	}

	public void Machinelearning() {
		click(Console, "Console");
		click(catalogue, "catalogue");
		click(ML, "ML");
		click(dropdownshow, "dropdownshow");
		click(firstoption, "First Option");
		click(Explore, "Explore");
	}
}
