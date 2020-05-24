package main.java.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage {
	
	@FindBy(xpath = "/html/body/div/div[2]/div/span")
	public WebElement currentTemparature;
	
	@FindBy(xpath = "/html/body/div/div[3]/div[1]/a/button")
	public WebElement moisturizersOption;
	
	@FindBy(xpath = "/html/body/div/div[3]/div[2]/a/button")
	public WebElement suncreensOption;
	

}
