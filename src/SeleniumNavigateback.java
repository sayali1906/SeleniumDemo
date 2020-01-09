import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumNavigateback {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		System.out.println("launching browser");
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);

		WebElement ele=driver.findElement(By.xpath("//input[@id=\'gsc-i-id1\']"));
		ele.sendKeys("TESTING",Keys.ENTER);
		Thread.sleep(2000);
		driver.navigate().back();
		ele.sendKeys("Java",Keys.ENTER);

	}

}
