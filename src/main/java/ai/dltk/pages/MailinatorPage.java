package ai.dltk.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ai.generic.BaseTest;
import ai.generic.ToolUtil;

public class MailinatorPage extends BaseTest {
private String mobileNumber;
private String Emailid;
private String passwordtxt= "qubitaitesting";


    @FindBy(xpath = "//div[@class='nav-title']")
    private WebElement mailinatorTxt;


    @FindBy(xpath = "//div[@class='signup-wrap']/h1")
    private WebElement WelcomeMessage;

    @FindBy(id = "id_firstname")
    private WebElement firstName;

    @FindBy(id = "id_lastname")
    private WebElement lastName;

    @FindBy(id = "id_mobile")
    private WebElement mobileNumbertxt;

    @FindBy(id = "id_reg_email")
    private WebElement email;

    @FindBy(id = "id_reg_password")
    private WebElement password;

    @FindBy(id = "id_confirm_password")
    private WebElement confirmPassword;

    @FindBy(id = "signup-radio")
    private WebElement signupradio;

    @FindBy(id = "signup-btn")
    private WebElement signupbutton;

    @FindBy(xpath = "//form[@class='form-activation']")
    private WebElement Activationpopup;

    @FindBy(name = "email")
    private WebElement usernameTxt;

    @FindBy(name = "password")
    private WebElement passwordTxt;

    @FindBy(name = "confirmPassword")
    private WebElement confirmPasswordTxt;

    @FindBy(name = "register")
    private WebElement submitBtn;

    public MailinatorPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 30);
        PageFactory.initElements(driver, this);
    }
    public void goTomailinator(){
        this.driver.get("https://www.mailinator.com/");
        this.wait.until(ExpectedConditions.visibilityOf(this.mailinatorTxt));
    }


    public String enterUserDetails(String firstName, String lastName){
        sendKeys(this.firstName,firstName,"First Name");
        sendKeys(this.lastName,lastName,"Last Name");
        mobileNumber= ToolUtil.getRandomPhoneNum();
        sendKeys(this.mobileNumbertxt,mobileNumber,"Mobile Number");
        Emailid=ToolUtil.getRandomEmail();
        sendKeys(this.email,Emailid,"Email Id");
        sendKeys(this.password,passwordtxt,"Password");
        sendKeys(this.confirmPassword,passwordtxt,"Confirm Password");
        this.signupradio.click();
        this.signupbutton.click();
        return Emailid;
    }

    public void validatepopup(){
        this.wait.until(ExpectedConditions.visibilityOf(this.Activationpopup));

    }

    public void submit(){
        this.submitBtn.click();
    }

}
