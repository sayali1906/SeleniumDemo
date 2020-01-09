import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleT {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		System.out.println("launching browser");
		driver.manage().window().maximize();
		driver.get("https://iqgenie.org/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class=\'person fas fa-user-circle\']")).click();
		Thread.sleep(1000);
driver.findElement(By.xpath("//a[@class=\'hollow button alert\']")).click();;

Thread.sleep(1000);
String parent_window=driver.getWindowHandle();
for(String child_window : driver.getWindowHandles())
{
	driver.switchTo().window(child_window);
}
Thread.sleep(3000);
String s1=driver.getTitle();
System.out.println(s1);
}
		
		
		
		
		





	}


