package ai.dltk.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ai.generic.BaseTest;

public class CataloguePage extends BaseTest{


    @FindBy(xpath = "//h2[text()='The Unified Open Source Deep Learning Platform']") 
    private WebElement WelcomeMessage;
    
    @FindBy(xpath= "//input[@id='shortcode-user-login']") 
    private WebElement userName;
    
    @FindBy(xpath = "//input[@id='shortcode-user-pass']") 
    private WebElement password;
    
    @FindBy(xpath = "//input[@id='shortcode-login-submit']") 
    private WebElement loginButton;
    
    @FindBy(xpath = "//iframe[contains(@data-testid, 'dialog_iframe')]")
    private WebElement iframe;
    
    @FindBy(xpath = "//div[@aria-label='close']")
    private WebElement close;
    
    
    
    @FindBy(xpath = "//li[@id='menu-item-5141']//a[@href='#'][normalize-space()='Open Source']") 
    private WebElement OpenSource;
    
    @FindBy(xpath= "//li[@id='menu-item-5141']/div/ul/li[1]/a") 
    private WebElement Catalogue;
    
    @FindBy(xpath = "//li[@id='menu-item-5922']//a[normalize-space()='Machine Learning']") 
    private WebElement MachineLearning;
    
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
    
    @FindBy(xpath = "//li[@id='menu-item-5966']//a[normalize-space()='Natural Language Processing']") 
    private WebElement NaturalLanguageProcessing;
    
    @FindBy(xpath = "//li[@id='menu-item-5995']//a[normalize-space()='Computer Vision']") 
    private WebElement ComputerVision;
    

    public CataloguePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 30);
        PageFactory.initElements(driver, this);
    }

    public void goTo(){
        this.driver.get("https://dltk.ai/");
        driver.manage().window().maximize();
        this.wait.until(ExpectedConditions.visibilityOf(this.WelcomeMessage));
    }

    public void login(String userName, String password){
    	closeChatBOt(iframe, close,"Close Chatbot");
        sendKeys(this.userName,userName,"Username");
        sendKeys(this.password,password,"Password");
        click(loginButton, "Login Button");
    }
    
    public void MachineLearning(){
    	try {
  			Thread.sleep(2000);
  		} catch (InterruptedException e) {
  			// TODO Auto-generated catch block
  			e.printStackTrace();
  		}
    	cataloguesubmenu(OpenSource, Catalogue, MachineLearning,"open catalogue submenu-Machine Learning");
    	try {
  			Thread.sleep(4000);
  		} catch (InterruptedException e) {
  			// TODO Auto-generated catch block
  			e.printStackTrace();
  		}
        click(Overview, "Overview");
        click(BeginnerGuide, "BeginnerGuide");
        click(Quickstart, "Quickstart");
        click(APIs, "APIs");
        click(SDK, "SDK");
        click(ReleaseNotes, "ReleaseNotes");
    }
        
    public void NaturalLanguageProcessing(){
    	try {
  			Thread.sleep(2000);
  		} catch (InterruptedException e) {
  			// TODO Auto-generated catch block
  			e.printStackTrace();
  		}
    	cataloguesubmenu(OpenSource, Catalogue, NaturalLanguageProcessing,"open catalogue submenu-NLP");
    	try {
  			Thread.sleep(3000);
  		} catch (InterruptedException e) {
  			// TODO Auto-generated catch block
  			e.printStackTrace();
  		}
        click(Overview, "Overview");
        click(BeginnerGuide, "BeginnerGuide");
        click(Quickstart, "Quickstart");
        click(APIs, "APIs");
        click(SDK, "SDK");
        click(ReleaseNotes, "ReleaseNotes");
    }
             
    public void ComputerVision(){
    	try {
  			Thread.sleep(2000);
  		} catch (InterruptedException e) {
  			// TODO Auto-generated catch block
  			e.printStackTrace();
  		}
        cataloguesubmenu(OpenSource, Catalogue, ComputerVision,"open catalogue submenu-CV");
        try {
  			Thread.sleep(3000);
  		} catch (InterruptedException e) {
  			// TODO Auto-generated catch block
  			e.printStackTrace();
  		}
        click(Overview, "Overview");
        click(BeginnerGuide, "BeginnerGuide");
        click(Quickstart, "Quickstart");
        click(APIs, "APIs");
        click(SDK, "SDK");
        click(ReleaseNotes, "ReleaseNotes");
    }
}