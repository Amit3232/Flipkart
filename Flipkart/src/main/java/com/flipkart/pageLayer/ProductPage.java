package com.flipkart.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.testBase.TestBase;

public class ProductPage extends TestBase {
	
	public ProductPage()
	{
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//button[text()='Buy Now']")
	private WebElement buy_button;
	
	@FindBy(xpath="//input[@maxlength='auto']")
	private WebElement enter_phonenumber;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement continue_button;
	
	public void clickOnBuyButton()
	{
		buy_button.click();
	}
	
	public void enterPhoneNumber(String number)
	{
		enter_phonenumber.sendKeys(number);
	}
	
	public void clickOnContinueBtn()
	{
		continue_button.click();
	}
	
	
	
}
