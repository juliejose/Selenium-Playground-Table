package basePkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	public static WebDriver driver;

	@BeforeTest
	public void setUp() {
		driver=new ChromeDriver();
		driver.get("https://www.lambdatest.com/selenium-playground/table-sort-search-demo");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
	}
}
