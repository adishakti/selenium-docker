package samplework;
import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;
	public class TC_Catalogue_001 {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AdityaVerma\\Documents\\Scripts\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		WebDriverWait g = new WebDriverWait(driver, 15);
		driver.manage().window().maximize();
		driver.get("https://dltk.ai");
		Thread.sleep(10);	
	    driver.findElement(By.xpath("//li[@id='menu-item-5141']//a[@href='#'][normalize-space()='Open Source']")).click();
	    Thread.sleep(10);
	    driver.findElement(By.xpath("//li[@id='menu-item-5143']//a[@href='#'][normalize-space()='Catalogue']")).click();
	    Thread.sleep(10);
	    driver.findElement(By.xpath("//li[@id='menu-item-5922']//a[normalize-space()='Machine Learning']")).click();
	    Thread.sleep(10);
	    driver.findElement(By.xpath("//span[@class='listFixed active']")).click();
	    Thread.sleep(10);
	    driver.findElement(By.xpath("//span[@class='listFixed'][normalize-space()=\"Beginner's Guide\"]")).click();
	    Thread.sleep(10);
	    driver.findElement(By.xpath("//span[@class='listFixed'][normalize-space()='Quickstart']")).click();
	    Thread.sleep(10);
	    driver.findElement(By.xpath("//span[@class='listFixed'][normalize-space()='APIs']")).click();
	    Thread.sleep(10);
	    driver.findElement(By.xpath("//span[@class='listFixed'][normalize-space()='SDK']")).click();
	    Thread.sleep(10);
	    driver.findElement(By.xpath("//span[@class='listFixed'][normalize-space()='Release Notes']")).click();
	    Thread.sleep(10);
	  
		
		}	
}
