import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",".\\softwares\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		System.out.println("launching Browser");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		//driver.get("http://selenium.dev/");
		driver.navigate().to("http://www.google.com/");
		System.out.println("loading url");
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.close();
		System.out.println("closing browser");


	}

}
