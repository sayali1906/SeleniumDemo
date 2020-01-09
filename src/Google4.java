

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Google4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Java");
		Thread.sleep(2000);
		Actions a=new Actions(driver); 
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
		Thread.sleep(1000);
		
		for(WebElement item: list) {
			System.out.println(item.getText());
			a.moveToElement(item).build().perform();
			Thread.sleep(10000);
		
		}
		
		
		

		
		

	}

}
