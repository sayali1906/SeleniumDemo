import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNgBluestonehome1 {
	@Test
	public void Demo() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com");
		Thread.sleep(2000);
		WebElement search= driver.findElement(By.xpath("//input[@name='search_query']"));
		 search.sendKeys("ring",Keys.ENTER);
		 Thread.sleep(2000);
		 WebElement nextDay=driver.findElement(By.xpath("//div[@class=\'ndd-wrapper\']"));
		 nextDay.click();
		 Thread.sleep(5000);
		 
		 WebElement count=(driver.findElement(By.xpath("//ul[@class=\'product-grid search-box-result\']")));
		 String size=count.getText();
		 Reporter.log(size, true);
		 driver.close();
		 
		}

}
