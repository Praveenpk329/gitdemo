package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.LandingPage;
import pageObjects.OfferPage;
import utils.TextcontextSetup;

public class OfferPagestepdefinition 
{

	public String offerpageproductName;
	TextcontextSetup textcontextSetup;
	public OfferPagestepdefinition (TextcontextSetup textcontextSetup )
	{
		this.textcontextSetup=textcontextSetup;
	}
	@Then("^user searched for (.+) shortform name in offers page$")
	public void user_searched_for_same_shortform_name_in_offers_page(String shortform) throws Exception 
	{
		switchToOffers();
        OfferPage op=new OfferPage(textcontextSetup.driver);
        op.offersearch(shortform);
	    Thread.sleep(2000);
	    offerpageproductName=op.offersProductName();
	}
	public void switchToOffers() 
	{
		LandingPage lp=textcontextSetup.pm.getLandingPage();
		lp.topDealsPage();
		textcontextSetup.gu.switchWindowToChild();
	}
	 @Then("to validate that the product exists")
	    public void to_validate_that_the_product_exists() 
	    {
	    	 Assert.assertEquals(offerpageproductName, textcontextSetup.landingpageproductName);
	    }

}
