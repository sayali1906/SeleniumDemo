import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",".\\softwares\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		System.out.println("launching Browser");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("http://selenium.dev/");
		System.out.println("loading url");
		Thread.sleep(2000);
		driver.close();
		System.out.println("closing browser");


	}

}
