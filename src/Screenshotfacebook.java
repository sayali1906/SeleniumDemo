import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshotfacebook {

	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
	 TakesScreenshot ts=(TakesScreenshot) driver;
	 File Screenshot=ts.getScreenshotAs(OutputType.FILE);
File ScreenSave=new File(".\\Screenshot\\facebook.png");
Files.copy(Screenshot, ScreenSave);
	}

}
