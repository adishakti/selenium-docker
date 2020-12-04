package samplework;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC_UsesCases_001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AdityaVerma\\Documents\\Scripts\\chromedriver.exe");
   	 WebDriver driver=new ChromeDriver();
   	 driver.manage().window().maximize();
       driver.get("https://dltk.ai/");
      
       driver.findElement(By.xpath("//li[@id='menu-item-5141']//a[@href='#'][text()='Open Source']")).click();
       driver.findElement(By.xpath("//li[@id='menu-item-6022']//a[text()='Use Cases']")).click();
       driver.findElement(By.xpath("//a[contains(text(),'Predict Age and Gender using Convolutional Neural ')]")).click();

       driver.close();
	   driver.quit();
      
	}

}
