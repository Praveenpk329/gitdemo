package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class OfferPage 
{
public RemoteWebDriver driver;
public OfferPage(RemoteWebDriver driver)
{
	this.driver=driver;
}
private By offersearch=By.xpath("//input[@type='search']");
private By OfferProductName=By.cssSelector("tr td:nth-child(1)");

public void offersearch(String name)
{
	driver.findElement(offersearch).sendKeys(name);
}
public String offersProductName()
{
	return driver.findElement(OfferProductName).getText();
}
}
