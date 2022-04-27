package utils;

import java.io.IOException;

import org.openqa.selenium.remote.RemoteWebDriver;

import pageObjects.PageObjectManager;

public class TextcontextSetup 
{
	public RemoteWebDriver driver;
	public String landingpageproductName;
	public PageObjectManager pm;
	public TestBase tb;
	public GenericUtils gu;
	public TextcontextSetup() throws Exception
	{
		tb=new TestBase();
		pm=new PageObjectManager(tb.WebDriverManager());
		gu=new GenericUtils(tb.WebDriverManager());
	}
}
