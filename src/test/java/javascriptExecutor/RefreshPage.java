package javascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RefreshPage {
	@Test
	public void demo() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.location=arguments[0]", "https://www.amazon.com/");
		
		//To get Title
		System.out.println(js.executeScript("return document.title"));
		//To get URL
		System.out.println(js.executeScript("return document.URL"));
		Thread.sleep(3000);
		//To refresh the page
		js.executeScript("history.go(0)");
		Thread.sleep(3000);
		driver.quit();

	}

}
