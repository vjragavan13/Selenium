import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://theautomationzone.blogspot.com/2020/07/basic-dropdown.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement fruit = driver.findElement(By.xpath("//select[@id='mySelect']"));

		Select s = new Select(fruit);
		
		Thread.sleep(3000);
		s.selectByValue("banana");
		
		Thread.sleep(3000);
		s.selectByIndex(2);
		
		Thread.sleep(3000);
		s.selectByVisibleText("Orange");
		
		Thread.sleep(3000);
		s.selectByIndex(0);
		
		WebElement car = driver.findElement(By.xpath("//select[@id='cars']"));
		
		Select s1 = new Select(car);
		Thread.sleep(3000);
		s1.selectByIndex(0);
		
		Thread.sleep(3000);
		s1.selectByValue("saab");
		
		Thread.sleep(3000);
		s1.selectByVisibleText("Opel");
		
		Thread.sleep(3000);
		s1.selectByIndex(3);
		
		driver.close();
	}

}
