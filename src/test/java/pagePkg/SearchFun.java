package pagePkg;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchFun {
WebDriver driver;
	
	
	 @FindBy(xpath="//*[@id=\"example_filter\"]/label/input")
	 WebElement searchbox;
	 
	
	 
	 public SearchFun(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
	 
		
	 public void searchNewYork() {
			searchbox.sendKeys("New York",Keys.ENTER);	
			List<WebElement> row=driver.findElements(By.xpath("//*[@id=\"example\"]/tbody/tr"));
			System.out.println("The totalnumber of rows:"+row.size());
			if(row.size()==5) {
				System.out.println("Actual Row count is 5 as expected");
			}
			else
			{
				System.out.println("Actual Row count is not 5 as expected");
			}	
		}
		
		
		public void tearDown() {
			driver.quit();
			System.out.println("Quit browser");
		}
}
