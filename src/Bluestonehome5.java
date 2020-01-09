import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bluestonehome5 {

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
		
		
		driver.findElement(By.xpath("//div[@class='form-submit text-center auto-filled']/input[@type='submit']")).click();
		Thread.sleep(1000);
		WebElement mobileno=driver.findElement(By.id("contactNumber"));
		mobileno.sendKeys("9168388305");
		
		
		WebElement fullname=driver.findElement(By.id("fullname"));
		fullname.sendKeys("Sayali");
		
		
		WebElement address=driver.findElement(By.id("address"));
		address.sendKeys("Hadapser");
	
		
		WebElement pincode=driver.findElement(By.id("postcode_delivery"));
		pincode.sendKeys("410513");
		
		
		driver.findElement(By.xpath("//input[@class=\'submit-checkout-save-address btn btn-s btn-pdp\']")).click();
		/*String title1=driver.getTitle();
		System.out.println(title1);
		
		
		WebElement nominees=driver.findElement(By.id("nomineeName"));
		nominees.sendKeys("pallavi");
		
		
		WebElement relas=driver.findElement(By.id("//select[@id='nomineeRelationship']/option[1]"));
		relas.click();
		
		
		WebElement nati=driver.findElement(By.xpath("//select[@id=\'nomineeNationality\']/option[1]"));
		nati.click();
		
		driver.findElement(By.name("_eventId_checkoutSaveAddressDetails")).click();
		
		
		
		String title2=driver.getTitle();
		System.out.println(title2);
		if(title1.equals(title2))
		{
			System.out.println(" navigating to payment page ");	
		}
		else
		{
			System.out.println(" no navigating to payment page ");
		}
		driver.close();*/
		
		}

		
		
		
		
		

	}


