import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDemo {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize(); 
		driver.get("file:///C:/Users/Admin/Desktop/Demo.html");
		WebElement opt=driver.findElement(By.xpath("//select[@id=\'b\']"));  
		
		Select s=new Select(opt);
		
	java.util.List<WebElement> values=s.getOptions();
	if(s.isMultiple())
		for(WebElement data:values)
		{
			System.out.println(data.getText());
			s.selectByValue(data.getText());
	
		}
	System.out.println(s.getFirstSelectedOption().getText());
java.util.List<WebElement> selectotp=s.getAllSelectedOptions();
for(WebElement val:selectotp)
{
	System.out.println(val.getText());
}
Thread.sleep(2000);
s.deselectAll();
}

		

	
	    

	}


