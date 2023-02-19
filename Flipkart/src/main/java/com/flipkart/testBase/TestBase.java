package com.flipkart.testBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.flipkart.pageLayer.HomePage;
import com.flipkart.pageLayer.ProductPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
public static WebDriver driver;

public HomePage home;
public ProductPage product;

@BeforeMethod
	public void start()
	{
String br = "CHROME";
		
		if(br.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(br.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(br.equalsIgnoreCase("Edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else 
		{
			System.out.println("Browser name is not proper");
		}
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	home = new HomePage();
	product = new ProductPage();
	
	
	
	}

	
@AfterMethod
	public void stop()
	{
		//driver.quit();
	}
	
}
