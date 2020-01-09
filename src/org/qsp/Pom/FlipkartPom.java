package org.qsp.Pom;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartPom {

	@FindBy(xpath="//input[@name=\"q\"]")
	private WebElement search;
	
	@FindBy(xpath="//button[@class=\"vh79eN\"]")
	private WebElement button;
	
	public FlipkartPom(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	public void searchTxt(String txt)
		{
			search.sendKeys(txt);
		}
		public void clickB()
		{
			button.click();
			
		}

	}


