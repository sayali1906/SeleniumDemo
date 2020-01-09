import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNgBluestone {
	@Test
public void Demo()
{
	System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	Reporter.log("launching browser");

	driver.manage().window().maximize();
	driver.get("https://www.bluestone.com/");
	WebElement ring= driver.findElement(By.xpath(" //a[contains(.,'Rings ')]"));
	Reporter.log(ring.getText());
	//Thread.sleep(2000);
	Actions a= new Actions(driver);
	//Thread.sleep(2000);
	a.moveToElement(ring).perform();
	//Thread.sleep(2000);
	driver.findElement(By.xpath(" //a[contains(.,'Rings')]/ancestor::ul[@class=\"wh-main-menu\"]/descendant::ul[@class=\"two-col\"]/descendant::li[2]/a[@title=\"Diamond Rings\"]")).click();
	//Thread.sleep(2000);
	WebElement price=driver.findElement(By.xpath("//section[@id=\"Price-form\"]/span[contains(.,'Price')]"));
	a.moveToElement(price).perform();
	List<WebElement> list=driver.findElements(By.xpath("//form[@id=\"price\"]/descendant::span[@data-tagcategory=\"Price\"] "));
	for(WebElement cost: list)
	{
		Reporter.log(cost.getText());
	}

}
}