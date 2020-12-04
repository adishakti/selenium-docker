package samplework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DLTKLogin {

	@Test
    public void Demo() throws InterruptedException
    {

		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AdityaVerma\\Documents\\Scripts\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		Thread.sleep(10);
		driver.get("https://dltk.ai/");
		Thread.sleep(10);
		
		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		System.out.println("Waiting for frame");
		
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[contains(@data-testid, 'dialog_iframe')]")));

		System.out.println("Frame found and Switched");
		
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//div[@aria-label='close']")).click();
		
		System.out.println("closed window");

		driver.switchTo().parentFrame();

		Thread.sleep(500);

		driver.findElement(By.xpath("//span[@class='elementor-button-text'][text()='Access Developer Portal']")).click();
		String winhandlebefor = driver.getWindowHandle();
		for (String Winhandle : driver.getWindowHandles()) {
			driver.switchTo().window(Winhandle);
		}

		driver.findElement(By.xpath("//a[text()='Sign In']")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='i2']"))
				.sendKeys("shakeel@qubitai.tech");

		driver.findElement(By.xpath("//input[@id='i4']")).sendKeys("qwerty");
		
		driver.findElement(By.xpath("//button[@class='signup_btn")).click();
		Thread.sleep(500);
		
		//driver.findElement(By.xpath("//button[@class='project_button_view btn btn-secondary dropdown-toggle']")).click();
		
		//Thread.sleep(5000);
		//driver.findElement(By.linkText("View API Details")).click();
		//driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		driver.close();
		driver.quit();
		
	
	}

}