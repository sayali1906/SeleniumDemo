package org.qsp.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartMiHome 
{
	@FindBy(xpath="//button[@class=\"_2AkmmA _29YdH8\"]")
	private WebElement cl;
	@FindBy(xpath="//span[text()='Electronics']")
	private WebElement ele;
	@FindBy(xpath="//a[@href=\"/mobiles/mi~brand/pr?sid=tyy,4io&otracker=nmenu_sub_Electronics_0_Mi\"]")
	private WebElement mi;
	@FindBy(xpath="//img[@alt='Redmi 8 (Sapphire Blue, 64 GB)']")
	private WebElement mob;
	@FindBy(xpath="//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")
	private WebElement cart;
	public void FlipkartMiHome(WebDriver driver)
	
	{
		PageFactory.initElements(driver, this);
	}
	public void popup()
	{
		cl.click();
	}
	public void electronicMouse(WebDriver driver)
	{
		Actions a=new Actions(driver);
		a.moveToElement(ele).build().perform();
		
	}
	public void brand()
	{
		mi.click();
	}
	public void mobile()
	{
		mob.click();
	}
	public void addcart()
	{
		cart.click();
	
	}
}



