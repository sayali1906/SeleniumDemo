import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocDemo {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		WebElement login=driver.findElement(By.xpath("//input[@value=\'Log In\']"));
		Point loc=login.getLocation();
		System.out.println(loc);
		int x=loc.getX();
		int y=loc.getY();
		System.out.println(x +" " +y);

		

	}

}
