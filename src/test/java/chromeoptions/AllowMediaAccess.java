package chromeoptions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllowMediaAccess {
	@Test
	public void demo() throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("use-fake-ui-for-media-stream");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(option);
		
		driver.manage().window().maximize();
		driver.get("https://mictests.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("mic-launcher")).click();
		Thread.sleep(3000);
		driver.quit();
		
	}

}
