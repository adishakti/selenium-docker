package ai.dltk.pages;

import ai.generic.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.assertj.core.api.SoftAssertions.assertSoftly;

public class GithubPage extends BaseTest {

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

    @FindBy(xpath = "//li[@id='menu-item-5141']//a[@href='#'][text()='Open Source']")
    private WebElement OpenSource;

    @FindBy(xpath = "//li[@id='menu-item-5142']//a[@target='_blank'][text()='GitHub']")
    private WebElement GitHub;

    @FindBy(xpath = "//span[@class='p-name vcard-fullname d-block overflow-hidden']")
    private WebElement GitHubName;



    public GithubPage(WebDriver driver){
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

        assertSoftly(softAssertions -> {
            softAssertions.assertThat(password)
                    .hasSize(12)
                    .doesNotContainAnyWhitespaces();
        });

        click(loginButton, "Login Button");
    }

    public void githublink(){
        submenuexpander(OpenSource,GitHub,"GitHub");
        //getText(GitHubName,"Github name");
    }
}