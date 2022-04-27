package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase 
{
	public RemoteWebDriver driver;
	public RemoteWebDriver WebDriverManager() throws IOException
	{
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//global.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String url=prop.getProperty("QAUrl");
		String browser=prop.getProperty("browser");
		String browser_maven=System.getProperty("browser");
		String Browser= browser_maven!=null ? browser_maven :browser;
		if(driver==null)
		{
			if (browser.equalsIgnoreCase("chrome"))
			{
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
			
			}
			if(browser.equalsIgnoreCase("firefox"))
			{
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
				
			}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get("url");
		}
		return driver;
	}
}
