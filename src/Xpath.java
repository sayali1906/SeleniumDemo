import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",".\\softwares\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		System.out.println("launching browser");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("pqr");
		//driver.findElement(By.xpath("]")).sendKeys("xyz");
		//WebElement 
		//driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("pqr");
		//WebElement email=driver.findElement(By.xpath("//label["))
//String name=email.getText();
//System.out.println(name.getText());
//driver.findElement()=(By.xpath("//input[@type='email']")).senkeys(name);


		
	}

}
