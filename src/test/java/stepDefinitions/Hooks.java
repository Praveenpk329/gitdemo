package stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.TextcontextSetup;

public class Hooks 
{
	TextcontextSetup textcontextsetup;
	public Hooks(TextcontextSetup textcontextsetup)
	{
		this.textcontextsetup=textcontextsetup;
	}
@After
public void AfterScenario() throws Exception
{
	textcontextsetup.tb.WebDriverManager().quit();
	
}
@AfterStep
public void AddScreenShot(Scenario scenario) throws Exception
{
	RemoteWebDriver driver=textcontextsetup.tb.WebDriverManager();
	if(scenario.isFailed())
	{
		File sourcePath=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		byte[] fileContent=FileUtils.readFileToByteArray(sourcePath);
		scenario.attach(fileContent, "image/png", "image");
	}
	System.out.println("i am here");
}
}
