import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bluestone {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Bluestone.com/");
		Thread.sleep(1000);
	    driver.findElement(By.xpath("//a[@title=\'Jewellery\']/parent::li/parent::ul/parent::div"));
	    Thread.sleep(1000);
	    List<WebElement> text = driver.findElements(By.xpath("//div[@class=\'bottom-header\']"));
		Actions a=new Actions(driver);//mouse over action
		Thread.sleep(10000);
					}
			
		}
	


