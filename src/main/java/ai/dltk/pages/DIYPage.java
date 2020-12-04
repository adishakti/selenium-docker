package ai.dltk.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ai.generic.BaseTest;

public class DIYPage extends BaseTest {

    private String SmartCameraHeader= "Smart Camera";
    private String OverviewHeader= "Overview";
    private String ApproachHeader= "Approach";
    private String PCHeader= "Project Creation";
    private String UsingSDKsHeader= "Using SDKs";
    private String ConnecttoDLTKHeader= "Connect to DLTK";
    private String SummaryHeader= "Summary";
    private String ReviewInspectorHeader= "Review Inspector";


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

    @FindBy(xpath= "//li[@id='menu-item-5144']//a[@href='#'][text()='DIY']")
    private WebElement DIY;

    @FindBy(xpath= "//li[@id='menu-item-5255']//a[text()='Smart Camera']")
    private WebElement SmartCamera;

    @FindBy(xpath= "//span[@class='listFixed active'][text()='Overview']")
    private WebElement Overview;

    @FindBy(xpath= "//span[@class='listFixed'][text()='Our Approach']")
    private WebElement OurApproach;

    @FindBy(xpath= "//span[@class='listFixed'][text()='Project Creation']")
    private WebElement ProjectCreation;

    @FindBy(xpath= "//span[@class='listFixed'][text()='Using SDKs']")
    private WebElement UsingSDKs;

    @FindBy(xpath= "//span[@class='listFixed'][text()='Connect to DLTK']")
    private WebElement ConnecttoDLTK;

    @FindBy(xpath= "//span[@class='listFixed'][text()='Summary']")
    private WebElement Summary;


    @FindBy(xpath= "//li[@id='menu-item-5289']//a[text()='Review Inspector']")
    private WebElement ReviewInspector;


    public DIYPage(WebDriver driver){
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



    public void SmartCamera(){
        submenuexpander(DIY,SmartCamera,"Smart Camera");
        click(Overview, "Overview");
        click(OurApproach, "OurApproach");
        click(ProjectCreation, "ProjectCreation");
        click(UsingSDKs, "UsingSDKs");
        click(ConnecttoDLTK, "ConnecttoDLTK");
        click(Summary, "Summary");
    }

    public void  ReviewInspector(){
        submenuexpander(DIY,ReviewInspector,"Review Inspector");
        click(Overview, "Overview");
        click(OurApproach, "OurApproach");
        click(ProjectCreation, "ProjectCreation");
        click(UsingSDKs, "UsingSDKs");
        click(ConnecttoDLTK, "ConnecttoDLTK");
        click(Summary, "Summary");
    }

}
