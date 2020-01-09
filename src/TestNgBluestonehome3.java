import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNgBluestonehome3 
{@Test
	public void Demo() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://www.bluestone.com");
		Thread.sleep(2000);
		WebElement search= driver.findElement(By.xpath("//input[@name=\'search_query\']"));
		 search.sendKeys("Rings",Keys.ENTER);
		 Thread.sleep(2000);
		 
		 WebElement price= driver.findElement(By.xpath("//span[text()='Price']"));
		 Actions a=new Actions(driver);
		 a.moveToElement(price).build().perform();
		 Thread.sleep(2000);

		 driver.findElement(By.xpath("//span[@class=\'prcs-dlh\']")).click();
		 Thread.sleep(2000);

WebElement count=(driver.findElement(By.xpath("//ul[@class=\'product-grid search-box-result\']")));

int total=count.getText().length();
Reporter.log("count is:"+ total,true);
		 
		
	}

}
