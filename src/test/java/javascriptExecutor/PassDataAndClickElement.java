package javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PassDataAndClickElement {
	
	@Test
	public void demo() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.location=arguments[0]", "https://www.amazon.com/");
		
		WebElement searchTab = driver.findElement(By.id("twotabsearchtextbox")); 
		js.executeScript("arguments[0].value=arguments[1]", searchTab,"phone");
		
		WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
		js.executeScript("arguments[0].click()", searchButton);
		Thread.sleep(3000);
		driver.quit();
	
	}

}
