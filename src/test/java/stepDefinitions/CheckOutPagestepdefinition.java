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
import pageObjects.checkoutpage;
import utils.TextcontextSetup;

public class CheckOutPagestepdefinition 
{
	public RemoteWebDriver driver;
	public String landingpageproductName;
	public String offerpageproductName;
	TextcontextSetup textcontextSetup;
	public checkoutpage cop;
	public CheckOutPagestepdefinition (TextcontextSetup textcontextSetup )
	{
		this.textcontextSetup=textcontextSetup;
		this.cop=textcontextSetup.pm.getcheckOutPage();
		
	}
@Then("verify user has ability to enter promocode and place the order")
public void verify_user_has_ability_to_enter_promocode() 
{
	 
	 Assert.assertTrue(cop.verifypromoBtn());
	 Assert.assertTrue(cop.verifyplaceorder());
	
}
@Then("^user proceeds to checkout and validate the (.+) items in checkout page$")
public void user_proceeds_to_checkout(String Name)
{
cop.checkOutItems();
}
}
