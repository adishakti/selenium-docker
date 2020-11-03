package ai.dltk.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ai.generic.BaseTest;
import ai.generic.ToolUtil;

public class RegistrationPage extends BaseTest {

    private final WebDriver driver;
    private final WebDriverWait wait;
    private String Emailid;
    private final String passwordtxt = "qubitaitest";
    private String mobileNumber;
    private String activationPopuptxt;
    private final String expectedPopuptxt ="Your Account Activation email is on its way";


    @FindBy(xpath = "//h2[text()='The Unified Open Source Deep Learning Platform']") 
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

    @FindBy(id = "activation-close")
    private WebElement Activationpopupclose;

    @FindBy(xpath = "//div[@class='activation-wrap']/p")
    private WebElement ActivationPopupMessage;

    @FindBy(name = "email")
    private WebElement usernameTxt;

    @FindBy(name = "password")
    private WebElement passwordTxt;

    @FindBy(name = "confirmPassword")
    private WebElement confirmPasswordTxt;

    @FindBy(name = "register")
    private WebElement submitBtn;

    public RegistrationPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 30);
        PageFactory.initElements(driver, this);
    }

    public void goTo(){
        this.driver.get("https://dltk.ai/");
        driver.manage().window().maximize();
        this.wait.until(ExpectedConditions.visibilityOf(this.WelcomeMessage));
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
        activationPopuptxt=getText(this.ActivationPopupMessage,"Get text from popup message");
        asserttxt(expectedPopuptxt,activationPopuptxt,"validate expected popup text: "+expectedPopuptxt+" and actual popup text: "+activationPopuptxt);
        click(Activationpopupclose, "Click on Pop-Up close");
    }


    public void submit(){
        this.submitBtn.click();
    }

}
