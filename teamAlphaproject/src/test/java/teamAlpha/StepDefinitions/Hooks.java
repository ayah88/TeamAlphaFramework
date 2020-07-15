package teamAlpha.StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	public static WebDriver driver;

	@Before
	public void setup() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");


	    driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://www.drugs.com/"); Thread.sleep(3000);
		driver.manage().window().maximize();

	}

	@After
	public void teardown() {

		driver.quit();
	}


}
