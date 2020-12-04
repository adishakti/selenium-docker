package samplework;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
//import sun.awt.www.content.audio.wav

public class TC_SmartFeed_06 {


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


		driver.findElement(By.xpath("//li[@id='menu-item-5751']//a[normalize-space()='Smart Feed']")).click();
		Thread.sleep(3000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,600)");
		Thread.sleep(3000);
int x = 1;

		//while(!driver.findElement(By.xpath("//a[contains(text(),'Computational thinking class enables students to e')]")).isDisplayed()){
		while (x<23) {
			js1.executeScript("window.scrollTo(0, document.body.scrollHeight);");
			Thread.sleep(3000);
			x++;
		}
		WebElement e = driver.findElement(By.xpath("//a[contains(text(),'Skills development in Physical AI could give birth')]"));
			js1.executeScript("arguments[0].scrollIntoView(false);", e);
		e.click();

		Thread.sleep(3000);
		js1.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		int y = 1;
		while (y<2) {
			js1.executeScript("window.scrollBy(0,1500)");
			Thread.sleep(3000);
			y++;
		}
		driver.findElement(By.xpath("//a[normalize-space()='CLICK HERE TO READ THE FULL ARTICLE']")).click();
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}
}

