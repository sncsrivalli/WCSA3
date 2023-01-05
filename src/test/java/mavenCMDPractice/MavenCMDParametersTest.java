package mavenCMDPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MavenCMDParametersTest {
	WebDriver driver;
	@Test
	public void vtigerLoginTest() {
		
		String browser = System.getProperty("browser");
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		String url = System.getProperty("url");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("user_name")).sendKeys(System.getProperty("user"));
		driver.findElement(By.name("user_password")).sendKeys(System.getProperty("pass"));
		driver.findElement(By.id("submitButton")).click();
		
		driver.quit();
		
		
	}

}
