package org.qsp.Pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumPom 
{
	
		
		@FindBy(xpath="//input[@name=\"search\"]")
		private WebElement search;
		
	
		private WebElement button;
		public SeleniumPom(WebDriver driver)
		{
		PageFactory.initElements(driver, this);
		}
		public void searchTxt(String txt)
			{
				search.sendKeys(txt,Keys.ENTER);
			}
			
				
		
		
		
	}


