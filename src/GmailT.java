import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailT {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		System.out.println("launching browser");
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com/");
		Thread.sleep(2000);
		


	}

}
