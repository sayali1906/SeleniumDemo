import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Urbanladder1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
	Thread.sleep(10000);
	//WebElement text = driver.findElement(By.xpath(//li/span[contains(.,'Decor')]);
	 driver.findElement(By.xpath("//a[@class=\'close-reveal-modal hide-mobile\']")).click();
	List<WebElement> text = driver.findElements(By.xpath("//ul[@class='topnav bodytext']"));
	for(WebElement sayali:text)
	{
		System.out.println(sayali.getText());
	}
	
	
	}

}
