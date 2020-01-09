import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actipop
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"menuTable\"]/descendant::div[@class=\"menu_icon\"][3]")).click();
		driver.findElement(By.xpath("//a[text()='About your actiTIME']")).click();
		WebElement txt=driver.findElement(By.xpath("//span[contains(.,'© 2019 actiTIME Inc. All rights reserved.')]"));
		System.out.println(txt.getText());
		

	}

}
