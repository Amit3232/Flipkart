package com.flipkart.pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.testBase.TestBase;

public class HomePage extends TestBase {
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}

//WebElements	
	
	@FindBy(xpath="//input[@title=\"Search for products, brands and more\"]")
	private WebElement search_box;
	
	@FindBy(xpath="//div[text()=' 9th generation']")
	private WebElement product_option;
	
	@FindBy(xpath="//div[text()='APPLE iPad Pro 2021 (5th Generation) 8 GB RAM 512 GB ROM 12.9 inches with Wi-Fi+5G (Silver)']")
	private WebElement select_product;
	
	public void enterProductName(String name) 
	{
		driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
		
		search_box.sendKeys(name);
	}
	public void selectProductOption()
	{
		product_option.click();
	}
	public void selectProduct()
	{
		select_product.click();
	}
	
	
}
