import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows_Handle {
public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\User\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	
	//Opening mobile in new tab
	WebElement Mobile = driver.findElement(By.xpath("(//a[@class='nav-a  '])[2]"));
	Thread.sleep(3000);
	Actions ac = new Actions(driver);
	ac.contextClick(Mobile).perform();
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	//Opening Today Deals in new window
	WebElement TodayDeals = driver.findElement(By.xpath("(//a[@class='nav-a  '])[3]"));
	Thread.sleep(3000);
	ac.contextClick(TodayDeals).perform();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	
	//Opening Customer Service in new window
	WebElement Customer = driver.findElement(By.xpath("(//a[@class='nav-a  '])[4]"));
	Thread.sleep(3000);
	ac.contextClick(Customer).perform();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	
	
	Set<String> windowHandles = driver.getWindowHandles();
	ArrayList<String>  a = new ArrayList<String>(windowHandles);
	Thread.sleep(3000);
	
	String title = driver.switchTo().window(a.get(0)).getTitle();
	System.out.println(title);
	
	String title2 = driver.switchTo().window(a.get(1)).getTitle();
	System.out.println(title2);
	Thread.sleep(3000);
	
	String title3 = driver.switchTo().window(a.get(2)).getTitle();
	System.out.println(title3);
	Thread.sleep(3000);
	
	String title4 = driver.switchTo().window(a.get(3)).getTitle();
	System.out.println(title4);
	Thread.sleep(3000);
	
	String title5 = driver.switchTo().window(a.get(1)).getTitle();
	System.out.println(title5);
	Thread.sleep(3000);
	
	WebElement Search = driver.findElement(By.id("twotabsearchtextbox"));
	Search.sendKeys("The Secret");
	Thread.sleep(3000);
	
	WebElement Enter = driver.findElement(By.id("nav-search-submit-button"));
	Enter.click();
	Thread.sleep(3000);
	driver.quit();
	
	
	
	
}
}
