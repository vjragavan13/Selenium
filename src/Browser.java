import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;

public class Browser {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
	    driver.navigate().refresh();
	    Thread.sleep(3000);
	    driver.navigate().forward();
	    
	    String currentUrl = driver.getCurrentUrl();
	    System.out.println(currentUrl);
	    
	    String title = driver.getTitle();
	    System.out.println(title);
	    
	    driver.quit();
		
	}

}
