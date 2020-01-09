import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flifkartc {

	

		public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize(); 
			driver.get("https://www.flipkart.com/");
		    Thread.sleep(10000);
		    driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		    
		    driver.findElement(By.xpath("//input[@name=\'q\']")).sendKeys("c# book",Keys.ENTER);
		    Thread.sleep(2000);
		   // driver.findElement(By.xpath("")).click();
		
	}

}
