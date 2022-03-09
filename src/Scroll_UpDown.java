import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_UpDown {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\User\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();

	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	
	
	WebElement Scrolldown = driver.findElement(By.xpath("//div[@class='nav-logo-base nav-sprite']"));
	Thread.sleep(3000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	js.executeScript("arguments[0].scrollIntoView();",Scrolldown);
	Thread.sleep(3000);
	//Scroll Up
	js.executeScript("window.scrollBy(0,-1000)");
	Thread.sleep(3000);
	//Scroll Down
	js.executeScript("window.scrollBy(0,-500)");
	Thread.sleep(3000);
	//Scroll Down
	js.executeScript("window.scrollBy(0.1000)");
	Thread.sleep(3000);
	
	driver.quit();
}
}
