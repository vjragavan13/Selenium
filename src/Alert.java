import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe" );
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		//Syntax
		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		//Syntax
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//a[@data-toggle='tab']) [3]")).click();
		driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
		//Syntax
		driver.switchTo().alert().sendKeys("raghav");
		driver.switchTo().alert().accept();
		
	    Thread.sleep(3000);
	    driver.close();
	}

}
