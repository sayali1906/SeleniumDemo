import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlejavascript {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		System.out.println("launching browser");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		WebElement search=driver.findElement(By.name("q"));
         search.sendKeys("java",Keys.ENTER);
         JavascriptExecutor	js= (JavascriptExecutor)driver;//to down
         js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        
         WebElement next=driver.findElement(By.xpath("//span[@style=\'display:block;margin-left:53px\']"));
         Thread.sleep(2000);
         
         while(next.isEnabled());
         {
        	 next.click();
             
            
         }
         }
        
         
         
		

	}


