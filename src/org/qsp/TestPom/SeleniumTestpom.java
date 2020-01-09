package org.qsp.TestPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.qsp.Pom.FlipkartPom;
import org.qsp.Pom.SeleniumPom;

public class SeleniumTestpom {

	public static void main(String[] args) throws InterruptedException 
	
		{
			System.setProperty("webdriver.chrome.driver", ".\\softwares\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize(); 
			driver.get("https://www.selenium.dev/");
			SeleniumPom fh=new SeleniumPom(driver);
			Thread.sleep(5000);
			fh.searchTxt("testing");
			//fh.clickB();
			Thread.sleep(5000);
			driver.navigate().back();
			Thread.sleep(5000);
	//fh.searchTxt("java");
	fh.searchTxt("Java");;
			
		

	}

}
