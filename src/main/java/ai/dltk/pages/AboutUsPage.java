package ai.dltk.pages;

import ai.generic.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.assertj.core.api.SoftAssertions.assertSoftly;

public class AboutUsPage extends BaseTest {

    private String WhyDLTKHeader= "Why DLTK?";
    private String TeamsHeader= "Teams";
    private String AdvisoryBoardHeader= "AdvisoryBoard";
    private String FoundingTeamHeader= "FoundingTeam";
    private String LeadershipTeamHeader= "LeadershipTeam";
    private String ProductTeamHeader= "ProductTeam";
    private String EngineeringTeamHeader= "EngineeringTeam";
    private String CollaborationsHeader= "Collaborations";
    private String ClientsHeader= "Clients";
    private String PartnersHeader= "Partners";
    private String AcademicCollaborationHeader= "AcademicCollaboration";



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

    @FindBy(xpath = "//li[@id='menu-item-5731']//a[text()='Why DLTK?']")
    private WebElement WhyDLTK;

    @FindBy(xpath = "//div[@id='header-menu-container']/ul/li[3]/a")
    private WebElement AboutUs;

    @FindBy(xpath= "//li[@id='menu-item-5896']//a[text()='Teams']")
    private WebElement Teams;

    @FindBy(xpath= "//span[text()='Advisory Board']")
    private WebElement AdvisoryBoard;

    @FindBy(xpath= "//span[text()='Founding Team']")
    private WebElement FoundingTeam;

    @FindBy(xpath= "//span[text()='Leadership Team']")
    private WebElement LeadershipTeam;

    @FindBy(xpath= "//span[text()='Product Team']")
    private WebElement ProductTeam;

    @FindBy(xpath= "//span[text()='Engineering Team']")
    private WebElement EngineeringTeam;

    @FindBy(xpath= "//li[@id='menu-item-5730']//a[text()='Collaborations']")
    private WebElement Collaborations;

    @FindBy(xpath= "//span[text()='Clients']")
    private WebElement Clients;

    @FindBy(xpath= "//span[text()='Partners']")
    private WebElement Partners;

    @FindBy(xpath= "//span[text()='Academic Collaboration']")
    private WebElement AcademicCollaboration;



    public AboutUsPage(WebDriver driver){
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

    public void WhyDLTK(){
        submenuexpander(AboutUs,WhyDLTK,"Why DLTK");
    }

    public void Teams(){
        submenuexpander(AboutUs,Teams,"Teams");
        click(FoundingTeam, "FoundingTeam");
        click(LeadershipTeam, "LeadershipTeam");
        click(ProductTeam, "ProductTeam");
        click(EngineeringTeam, "EngineeringTeam");
        click(AdvisoryBoard, "AdvisoryBoard");
        click(Collaborations, "Collaborations");
        click(Clients, "Clients");
        click(Partners, "Partners");
        click(AcademicCollaboration, "AcademicCollaboration");
    }

    public void Collaborations(){
        submenuexpander(AboutUs,Collaborations,"Collaborations");
        click(Partners, "Partners");
        click(AcademicCollaboration, "AcademicCollaboration");
        click(Clients, "Clients");
    }


}
