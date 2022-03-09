import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.ajio.com/?utm_source=Admitad&utm_medium=Affiliate&utm_campaign=4c57eb4fcc1adf00d3202904f2259629");
    driver.manage().window().maximize();
    driver.navigate().to("https://www.facebook.com/");
	
    driver.findElement(By.id("email")).sendKeys("vijay");
    
    WebElement pass = driver.findElement(By.name("pass"));
    pass.sendKeys("9677078087");
    
    
	
	driver.findElement(By.name("login")).click();
	}

}
