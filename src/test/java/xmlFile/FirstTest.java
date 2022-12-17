package xmlFile;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {
	
	@Test
	public void demo(XmlTest xml) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(xml.getParameter("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys(xml.getParameter("username"));
		driver.findElement(By.name("pwd")).sendKeys(xml.getParameter("password"));
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(5000);
		driver.quit();
	}

}
