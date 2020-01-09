import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettitle {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		 
		System.out.println("Title of webpage by getTitle() method: "+driver.getTitle());

		WebElement titleEle=driver.findElement(By.tagName("title"));
		
		System.out.println("Title of webpage by webelement title : "+titleEle.getAttribute("textContent"));
	}

}
