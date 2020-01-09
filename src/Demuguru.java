import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demuguru {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/upload/");
		
		driver.findElement(By.xpath("//div[@id=\'file_wraper0\']")).click();
		Thread.sleep(1000);
		Runtime rt=Runtime.getRuntime();
		rt.exec("C:\\Autoid.exe");
		
		

	}

}
