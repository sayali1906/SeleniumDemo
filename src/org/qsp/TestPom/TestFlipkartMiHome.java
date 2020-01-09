package org.qsp.TestPom;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.qsp.Pom.FlipkartMiHome;

public class TestFlipkartMiHome {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//upcasting
		driver.manage().window().maximize();	
       System.out.println("Launching browser");
        driver.get("https://www.flipkart.com/");
     // Thread.sleep(2000);
       
      FlipkartMiHome fmi = new FlipkartMiHome();
        Thread.sleep(8000);
       
        fmi.electronicMouse(driver);
        Thread.sleep(5000);
        
        fmi.brand();
        Thread.sleep(5000);
         
        fmi.mobile();
        Thread.sleep(5000);
        Set<String>parent=driver.getWindowHandles();
        for (String child: parent)
        {
			driver.switchTo().window(child);
		}
        
        fmi.addcart();
        Thread.sleep(5000);
        
	}

}
