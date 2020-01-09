import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Facebookdataprovider {

	@Test(dataProvider="getData")
	public void createUser(String un,String pw) {
		Reporter.log("create:"+ un +"pwd:"+pw,true);
		
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys(un);
		driver.findElement(By.id("pass")).sendKeys(pw);
		driver.findElement(By.id("loginbutton")).click();
        driver.close();
        
        
	}
}
