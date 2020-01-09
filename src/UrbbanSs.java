import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UrbbanSs {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
	Thread.sleep(1000);
	 driver.findElement(By.xpath("//a[@class=\'close-reveal-modal hide-mobile\']")).click();
	List<WebElement> text = driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li"));
	Actions a=new Actions(driver);//mouse over action
	Thread.sleep(1000);
	for(WebElement menu:text)
	{
		System.out.println(menu.getText());
		String name=menu.getText();
		a.moveToElement(menu).build().perform();
		Thread.sleep(1000);
Screenshotsave.screenShot(driver, name);

	}

}
}