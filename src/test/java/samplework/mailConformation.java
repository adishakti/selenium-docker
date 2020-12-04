package samplework;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class mailConformation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\AdityaVerma\\Documents\\Scripts\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
WebDriverWait g = new WebDriverWait(driver, 15);
driver.manage().window().maximize();
driver.get("https://www.mailinator.com/v3/index.jsp?zone=public&query=sha00#/#inboxpane");
Thread.sleep(30);
driver.findElement(By.xpath("//body[@id='InboxCtrl']//td[3]")).click();
Thread.sleep(30);
driver.switchTo().frame(driver.findElement(By.id("msg_body")));
Actions a= new Actions(driver);
Thread.sleep(30);
WebElement target = driver.findElement(By.tagName("a"));
Thread.sleep(30);
a.doubleClick(target).build().perform();
driver.switchTo().defaultContent();
Set<String>ids=driver.getWindowHandles();
java.util.Iterator<String> it= ids.iterator();
Thread.sleep(30);
String parentid =it.next();
Thread.sleep(30);
String childid =it.next();
driver.switchTo().window(childid);
System.out.println(driver.getTitle());
driver.findElement(By.xpath("//input[@name='submit']")).click();
Thread.sleep(30);
System.out.println("Clicked and Activated");
	}	
}
	