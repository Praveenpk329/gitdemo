package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LandingPage 
{
	public RemoteWebDriver driver;
	public LandingPage(RemoteWebDriver driver)
	{
		this.driver=driver;
	}
	private By search=By.xpath("//input[@type='search']");
	private By productName=By.cssSelector("h4.product-name");
	private By topDeals=By.linkText("Top Deals");
	private By Increment=By.cssSelector("a.increment");
	private By AddToCart=By.cssSelector(".product-action button");
	
	public void search(String name)
	{
	driver.findElement(search).sendKeys(name);
	}
	public void getsearchText()
	{
	driver.findElement(search).getText();
	}
	public String getproductName()
	{
	return driver.findElement(productName).getText();
	}
	public void topDealsPage()
	{
		driver.findElement(topDeals).click();
	}
	public String getTitleLandingPage()
	{
	return driver.getTitle();
	}
	public void increment(int quantity)
	{
		int i=quantity-1;
		while(i>0)
		{
			driver.findElement(Increment).click();
			i--;
		}
	}
	public void AddtoCart() 
	{
		driver.findElement(AddToCart).click();
	}
}
