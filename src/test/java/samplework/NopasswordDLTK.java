package samplework;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NopasswordDLTK {

	@Test
    public void Demo() throws InterruptedException
    {

		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AdityaVerma\\Documents\\Scripts\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(10);
		driver.get("https://dltk.ai/");
		Thread.sleep(10);
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
		driver.findElement(By.xpath("//input[@id='i2']']"))
				.sendKeys("shakeel@qubitai.tech");
		driver.findElement(By.xpath("//button[@class='signup_btn']")).click();
		Thread.sleep(5000);
		
		//driver.findElement(By.xpath("//button[@class='project_button_view btn btn-secondary dropdown-toggle']")).click();
		
		//Thread.sleep(5000);
		//driver.findElement(By.linkText("View API Details")).click();
	//	driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[4]/div/div[2]/div/div/a")).click();
		//driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		driver.close();
		driver.quit();
		
	
	}

}




	