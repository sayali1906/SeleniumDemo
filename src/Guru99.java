import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/v1/index.php");
		driver.findElement(By.xpath("//input[@name=\'btnLogin\']")).click();
	
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
	a.accept();

	}

}
