import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demolaunch2
{

	public static void main(String[] args) throws InterruptedException  
	{
		 
       System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		System.out.println("launching browser");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("Dhamdhere");
		WebElement pass=driver.findElement(By.id("pass"));
		pass.sendKeys("sayali");
		WebElement log_in=driver.findElement(By.id("loginbutton"));
		log_in.click();
		
	}

}
