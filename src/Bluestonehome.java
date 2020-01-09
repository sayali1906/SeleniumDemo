import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bluestonehome {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Bluestone.com/");
		Thread.sleep(1000);
	driver.findElement(By.xpath("//div[@class='hp-gms-banner']")).click();
	driver.findElement(By.xpath("//div[@class='form-submit text-center auto-filled']/input[@type='submit']")).click();
	WebElement amount=driver.findElement(By.id("amount_error"));
	System.out.println(amount.getText());
	
	WebElement email=driver.findElement(By.id("Email_error"));
	System.out.println(email.getText());
	driver.close();
	

	
	}

}
