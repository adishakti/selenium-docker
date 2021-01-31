package ai.dltk.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import ai.generic.BaseTest;

public class Pricingpage extends BaseTest {

	@FindBy(xpath = "//a[text()='Pricing']")
	private WebElement pricing;

	@FindBy(xpath = "//mat-toolbar/div[3]/div[3]/button")
	private WebElement pricingmenu;

	@FindBy(xpath = "//div[@class='mat-slide-toggle-bar mat-slide-toggle-bar-no-side-margin']")
	private WebElement button;

	@FindBy(xpath = "//mat-card-content/div/div[3]//button")
	private WebElement Moreinfo1;

	@FindBy(xpath = "//mat-card-content/div/div[4]//button")
	private WebElement Moreinfo2;

	@FindBy(xpath = "//mat-card-content/div/div[4]//button")
	private WebElement Moreinfo3;

	@FindBy(xpath = "//mat-card-content/div/div[5]//button")
	private WebElement Moreinfo4;

	@FindBy(xpath = "//a[@class='btn btn-sm btn-warning']/font[text()='Contact Us']")
	private WebElement ContactUs;

	@FindBy(xpath = "//mat-card-content/div/div[2]//button")
	private WebElement Sembcorp;

	@FindBy(xpath = "//div[@class='error-subtitle']")
	private WebElement pagenotfound;

	public Pricingpage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 30);
		PageFactory.initElements(driver, this);
	}

	public void pricing() {
		click(pricing, "pricing");
	}

	public void button() {
		click(pricingmenu, "Pricing Menu");
		click(button, "button");
		TakeScreenshot("Pricing Toggle-View");
	}

	public void Moreinfo1() {
		click(pricingmenu, "Pricing Menu");
		click(Moreinfo1, "Moreinfo1");
		String pageError = getText(pagenotfound, "Page Not Found");
		asserttxt("", pageError, "Assertion on Pricingpage Contact us");
	}

	public void Moreinfo2() {
		click(pricingmenu, "Pricing Menu");
		click(Moreinfo2, "Moreinfo2");
		String pageError = getText(pagenotfound, "Page Not Found");
		asserttxt("", pageError, "Assertion on Pricingpage Contact us");
	}

	public void Moreinfo3() {
		click(pricingmenu, "Pricing Menu");
		click(Moreinfo3, "Moreinfo3");
		String pageError = getText(pagenotfound, "Page Not Found");
		asserttxt("", pageError, "Assertion on Pricingpage Contact us");
	}

	public void Moreinfo4() {
		click(pricingmenu, "Pricing Menu");
		click(Moreinfo4, "Moreinfo4");
		String pageError = getText(pagenotfound, "Page Not Found");
		asserttxt("", pageError, "Assertion on Pricingpage Contact us");
	}

	public void Sembcorp() {
		click(pricingmenu, "Pricing Menu");
		click(Sembcorp, "Sembcorp");
		String pageError = getText(pagenotfound, "Page Not Found");
		asserttxt("", pageError, "Assertion on Pricingpage Contact us");
	}
}
