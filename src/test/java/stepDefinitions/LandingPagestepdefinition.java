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
import utils.TextcontextSetup;

public class LandingPagestepdefinition 
{
	public RemoteWebDriver driver;
	public String landingpageproductName;
	public String offerpageproductName;
	TextcontextSetup textcontextSetup;
	LandingPage lp;
	public LandingPagestepdefinition (TextcontextSetup textcontextSetup )
	{
		this.textcontextSetup=textcontextSetup;
		this.lp=textcontextSetup.pm.getLandingPage();
	}
	@Given("user is on GreenKart Landing page")
	public void user_is_on_green_kart_landing_page()
	{
    Assert.assertTrue(lp.getTitleLandingPage().contains("GreenKart"));
	}
	@When("^user searched with shortform with (.+) and extracted the actual name of product$")
	public void user_searched_with_shortform_with_and_extracted_the_actual_name_of_product(String shortform) throws InterruptedException 
	{
	 
     lp.search(shortform);
	 Thread.sleep(2000);
	 lp.getproductName().split("-")[0].trim();
     textcontextSetup.landingpageproductName=lp.getproductName().split("-")[0].trim();
     System.out.println(landingpageproductName+ "Extracted from home page");
	}
   @When("Added {string} items of selected product to cart")
   public void Added_items_of_selected_product(String quantity)
   {
	   lp.increment(Integer.parseInt(quantity));
	   lp.AddtoCart();
   }
}
