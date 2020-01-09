import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.dev/");
		Thread.sleep(1000);
		JavascriptExecutor	js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");//for y index
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,-1000)");//down to top
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");//for to Down
		Thread.sleep(5000);
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
	}

}
