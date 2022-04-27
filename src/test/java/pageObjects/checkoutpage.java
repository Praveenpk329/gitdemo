package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class checkoutpage 
{
	public RemoteWebDriver driver;
	public checkoutpage(RemoteWebDriver driver)
	{
		this.driver=driver;
	}
	By cart=By.cssSelector("[alt='Cart']");
	By checkOutButton=By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	By promobtn=By.cssSelector(".promoBtn");
	By placeorder=By.xpath("//button[contains(text(),'Place Order')]");
	
	public void checkOutItems()
	{
		driver.findElement(cart).click();
		driver.findElement(checkOutButton).click();
	}
	public Boolean verifypromoBtn()
	{
		return driver.findElement(promobtn).isDisplayed();
    }
	public Boolean verifyplaceorder()
	{
		return driver.findElement(placeorder).isDisplayed();
    }
	public String getTitleLandingPage()
	{
		return driver.getTitle();
	}
	

}
