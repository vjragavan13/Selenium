
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen_Shot {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", 
			"E:\\java\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	
	//Syntax
	TakesScreenshot ts = (TakesScreenshot) driver;
	File vj = ts.getScreenshotAs(OutputType.FILE);
	File des = new File("C:\\Users\\User\\eclipse-workspace\\Selenium\\ScreenShot\\flip.png");
	FileUtils.copyFile(vj, des);
	driver.close();
	
	
	
}
}
