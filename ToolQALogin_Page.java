package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ApplicationUtility.Applicationutility;
import BaseLibrary.BaseLibrary;
import ScreenshotUtility.Screenshotutility;

public class ToolQALogin_Page extends BaseLibrary
{
	public ToolQALogin_Page()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[text()='Demo Site']")
	private WebElement Demosite;
	
	@FindBy(xpath="//*[text()='Elements']")
	private WebElement Elements;
	
	
	public void getlaunchtoolsqa_url()
	{
		GetlaunchURL("https://www.toolsqa.com/");	
		//Screenshotutility.getscreenshot("passedtest", "getlaunchtoolsqa_url");
	}
	
	public void ClickonDemosite()
	{
		try 
		{
			Demosite.click();
			Applicationutility.Changewindow(1);
		} catch (Exception e) {	
			System.out.println("Issue in ClickonDemosite method"+e);
		}
	}
	
	public void ClickonElements()
	{
		try 
		{
			Applicationutility.getscrollbyxpath(Elements);
			Elements.click();
		} catch (Exception e) {
			
			System.out.println("Issue in ClickonElements"+e);
		}
	}
	
}
