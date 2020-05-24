package main.java.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Pages {
	
	public static CartPage cartPage;
	public static ListingPage listingPage;
	public static PaymentPage paymentPage;
	public static ResultPage resultPage;
	
	public static void initializePages(WebDriver driver)
	{
		cartPage = PageFactory.initElements(driver, CartPage.class);
		listingPage = PageFactory.initElements(driver, ListingPage.class);
		paymentPage = PageFactory.initElements(driver, PaymentPage.class);
		resultPage = PageFactory.initElements(driver, ResultPage.class);

	}

}
