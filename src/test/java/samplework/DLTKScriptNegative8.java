package samplework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class DLTKScriptNegative8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\Users\\AdityaVerma\\Documents\\Scripts\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	WebDriverWait g = new WebDriverWait(driver, 15);
	driver.manage().window().maximize();
	driver.get("https://dltk.ai/register/");
	Thread.sleep(10);
	driver.findElement(By.id("signup_username")).sendKeys("0010shaga");
	Thread.sleep(10);
    driver.findElement(By.id("signup_email")).sendKeys("sha00@mailinator.com");
    Thread.sleep(10);
    driver.findElement(By.id("pass1")).sendKeys("Gaurav@1234");
    Thread.sleep(10);
    driver.findElement(By.xpath("//input[@id='field_1']")).sendKeys("Gaurav");
    Thread.sleep(10);
    Select u= new Select(driver.findElement(By.id("field_25")));
    u.selectByVisibleText("Company");
    Thread.sleep(10);
    driver.findElement(By.id("field_14")).sendKeys("Qubitai");
    Thread.sleep(10);
    driver.findElement(By.id("field_15")).sendKeys("gaurav@qubitai.tech");
    Thread.sleep(10);
    driver.findElement(By.id("field_2-html")).click();
    Thread.sleep(10);
    driver.findElement(By.id("field_2")).sendKeys("Cricket");
    Thread.sleep(10);
    Select s= new Select(driver.findElement(By.id("field_3_day")));
    s.selectByIndex(14);
    Thread.sleep(10);
    Select z= new Select(driver.findElement(By.id("field_3_month")));
    z.selectByVisibleText("October");
    Thread.sleep(10);
   // Select v= new Select(driver.findElement(By.id("field_3_year")));
    //v.selectByVisibleText("1994");
    Thread.sleep(10);
    driver.findElement(By.xpath("//*[@id=\"field_9\"]")).sendKeys("Agra");
    Thread.sleep(10);
    driver.findElement(By.xpath("//*[@id=\'signup-form\']/div[2]/p/input")).click();
    Thread.sleep(30);
    System.out.println("Clicked Check Box..");
    Thread.sleep(3000L);
    WebElement a= driver.findElement(By.xpath("//input[@id='submit']"));
    a.click(); 	
    Thread.sleep(3000L);
	}
	}
