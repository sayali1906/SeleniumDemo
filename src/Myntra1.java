import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra1 {

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
	Thread.sleep(10000);
		List<WebElement> text = driver.findElements(By.xpath("//header[@class=\'desktop-container\']"));
	Actions a=new Actions(driver);//mouse over action
	
	for(WebElement menu:text)
	{
		System.out.println(menu.getText());
		String name=menu.getText();
		a.moveToElement(menu).build().perform();
		Thread.sleep(10000);
		//List<WebElement> submenu=driver.findElements(By.xpath("//span[contains(.,'""));
//		for(WebElement subitemsname:submenu)
		{
	//		System.out.println(subitemsname.getText());
		}
		
	
		Thread.sleep(10000);

	}

}
}
