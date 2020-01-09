import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Blustonehome3 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Bluestone.com/");
			Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='hp-gms-banner']")).click();

		WebElement amount=driver.findElement(By.name("amount"));
		amount.sendKeys("2000");
		Thread.sleep(1000);
		WebElement email=driver.findElement(By.name("email"));
		email.sendKeys("sayali123@gmail.com");
		
		String title1=driver.getTitle();
		System.out.println(title1);
		driver.findElement(By.xpath("//div[@class='form-submit text-center auto-filled']/input[@type='submit']")).click();

		String title2=driver.getTitle();
		System.out.println(title2);
		
		if(title1!=title2)
		{
			System.out.println("  reflected in this next page");	
		}

	}

}
