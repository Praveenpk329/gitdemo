package pageObjects;

import org.openqa.selenium.remote.RemoteWebDriver;

public class PageObjectManager 
{
	public RemoteWebDriver driver;
	public LandingPage lp;
	public OfferPage op;
	public checkoutpage cop;
	public PageObjectManager(RemoteWebDriver driver)
	{
		this.driver=driver;
	}

	public LandingPage getLandingPage()
	{
		lp=new LandingPage(driver);
		return lp;
	}
	public OfferPage getOfferPage()
	{
		op=new OfferPage(driver);
		return op;
	}
	public checkoutpage getcheckOutPage()
	{
		cop=new checkoutpage(driver);
		return cop;
	}
}
