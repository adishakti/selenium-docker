package ai.dltk.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ai.generic.BaseTest;

public class UseCasePage extends BaseTest{


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
    
    @FindBy(xpath = "//li[@id='menu-item-5141']") 
    private WebElement OpenSource;
    
  //a[@href='#'][text()='Open Source']
    
    @FindBy(xpath = "//li[@id='menu-item-6022']") 
  //a[text()='Use Cases']
    private WebElement UseCases;
    
    @FindBy(xpath = "//iframe[contains(@data-testid, 'dialog_iframe')]") 
    private WebElement Iframe;

    @FindBy(xpath = "//div[@aria-label='close") 
    private WebElement Close;
    
    @FindBy(xpath = "//a[contains(text(),'Predict Age and Gender using Convolutional Neural ')]") 
    private WebElement PredictAgeGender;
    
    @FindBy(xpath = "//span[@class='listFixed active']") 
    private WebElement Introduction;
    
    @FindBy(xpath = "//span[@class='listFixed'][text()='Problem Statement']") 
    private WebElement ProblemStatement;
    
    @FindBy(xpath = "//span[@class='listFixed'][text()='Architecture']") 
    private WebElement Architecture;
    
    @FindBy(xpath = "//span[@class='listFixed'][text()='Explanation']") 
    private WebElement Explanation;
    
    @FindBy(xpath = "//span[@class='listFixed'][text()='Outputs']") 
    private WebElement Outputs;
    
    
    @FindBy(xpath = "//a[contains(text(),'Predict Electricity Consumption using Time Series ')]") 
    private WebElement PredictElectricity;
    
  
    @FindBy(xpath = "//a[contains(text(),'Demystify DNA Sequencing with Machine Learning and')]") 
    private WebElement DNASequencing ;
    
    
    @FindBy(xpath = "//a[contains(text(),'Text Classification Quora')]") 
    private WebElement  quora;
    

    public UseCasePage(WebDriver driver){
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
    	closeChatBOt(iframe, close);
        sendKeys(this.userName,userName,"Username");
        sendKeys(this.password,password,"Password");
        click(loginButton, "Login Button");
    }
    
    public void PredictAgeGender(){
    	try {
  			Thread.sleep(2000);
  		} catch (InterruptedException e) {
  			// TODO Auto-generated catch block
  			e.printStackTrace();
  		}
    	submenuelement(OpenSource, UseCases);
    	try {
  			Thread.sleep(4000);
  		} catch (InterruptedException e) {
  			// TODO Auto-generated catch block
  			e.printStackTrace();
  		}
	    click(PredictAgeGender, "PredictAgeGender");
        click(Introduction, "Introduction");
        click(ProblemStatement, "ProblemStatement");
        click(Architecture, "Architecture");
        click(Explanation, "Explanation");
        click(Outputs, "Outputs");
    }
    public void PredictElectricity(){
    	try {
  			Thread.sleep(2000);
  		} catch (InterruptedException e) {
  			// TODO Auto-generated catch block
  			e.printStackTrace();
  		}
    	submenuelement(OpenSource, UseCases);
    	try {
  			Thread.sleep(3000);
  		} catch (InterruptedException e) {
  			// TODO Auto-generated catch block
  			e.printStackTrace();
  		}
	    click(PredictElectricity, "PredictElectricity");
        click(Introduction, "Introduction");
        click(ProblemStatement, "ProblemStatement");
        click(Architecture, "Architecture");
        click(Explanation, "Explanation");
        click(Outputs, "Outputs");
    }
        
     public void DNASequencing(){
    	 try {
   			Thread.sleep(2000);
   		} catch (InterruptedException e) {
   			// TODO Auto-generated catch block
   			e.printStackTrace();
   		}
     	submenuelement(OpenSource, UseCases);
     	try {
   			Thread.sleep(3000);
   		} catch (InterruptedException e) {
   			// TODO Auto-generated catch block
   			e.printStackTrace();
   		}
	    click(DNASequencing, "DNASequencing");
        click(Introduction, "Introduction");
        click(ProblemStatement, "ProblemStatement");
         click(Architecture, "Architecture");
         click(Explanation, "Explanation");
         click(Outputs, "Outputs");
     }
      public void quora(){
    	  try {
    			Thread.sleep(2000);
    		} catch (InterruptedException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
      	submenuelement(OpenSource, UseCases);
      	try {
    			Thread.sleep(4000);
    		} catch (InterruptedException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
     	 click(quora, "Dquora");
        click(Introduction, "Introduction");
        click(ProblemStatement, "ProblemStatement");
        click(Architecture, "Architecture");
	         click(Explanation, "Explanation");
        click(Outputs, "Outputs");
	            
      }
}
