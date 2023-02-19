package com.flipkart.testLayer;

import org.testng.annotations.Test;

import com.flipkart.testBase.TestBase;

public class TestClass extends TestBase 
{
@Test
	public void buyProduct() throws InterruptedException
	{
	
		home.enterProductName("ipad");
		home.selectProductOption();
		home.selectProduct();
		product.clickOnBuyButton();
		product.enterPhoneNumber("9096437343");
		product.clickOnContinueBtn();
		
	}
	
}
