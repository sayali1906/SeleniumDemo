import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoactitime {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		System.out.println("launching browser");
		Thread.sleep(2000);
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		//String s1=driver getTitle();
		//System.out.Println("s1");
		WebElement id=driver.findElement(By.id("username"));
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("password",Keys.ENTER);
		//String s2=driver getTitle("s2");
		//System.out.Println("s2");
		id.sendKeys("admin");
		driver.findElement(By.name("pwd"));
        Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("password",Keys.ENTER);
		
		

	}

}
