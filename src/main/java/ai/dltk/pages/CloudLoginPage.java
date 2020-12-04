package ai.dltk.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.assertj.core.api.SoftAssertions.assertSoftly;
import ai.generic.BaseTest;

public class CloudLoginPage extends BaseTest {


    @FindBy(xpath = "//h2[text()='The Unified Open Source Deep Learning Platform']") 
    private WebElement WelcomeMessage;
    
    @FindBy(xpath= "//input[@id='shortcode-user-login']") 
    private WebElement userName;
    
    @FindBy(xpath = "//input[@id='shortcode-user-pass']") 
    private WebElement password;
    
    @FindBy(xpath = "//input[@id='shortcode-login-submit']") 
    private WebElement loginButton;
    
    @FindBy(xpath = "//a[@href='http://developer.dltk.ai'][@class='elementor-button-link elementor-button elementor-size-md']") 
    private WebElement developerAccess;
    
    @FindBy(xpath = "//iframe[contains(@data-testid, 'dialog_iframe')]")
    private WebElement iframe;
    
    @FindBy(xpath = "//div[@aria-label='close']")
    private WebElement close;
    
    @FindBy(xpath = "//a[text()='Sign In']") 
    private WebElement DevSigninlink;
    
    @FindBy(xpath = "//input[@id='i2']") 
    private WebElement DevUser;
    
    @FindBy(xpath = "//input[@id='i4']") 
    private WebElement DevPass;
    
    @FindBy(xpath = "//button[@id='signin-btn']") 
    private WebElement DevSigninButton;
    

    public CloudLoginPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 30);
        PageFactory.initElements(driver, this);
    }

    public void goTo(){
        this.driver.get("https://cloud.dltk.ai/");
        driver.manage().window().maximize();
        this.wait.until(ExpectedConditions.visibilityOf(this.WelcomeMessage));
    }

}