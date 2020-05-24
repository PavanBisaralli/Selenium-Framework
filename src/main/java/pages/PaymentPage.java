package main.java.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPage {

	@FindBy(xpath="//input[@type='email']")
	public WebElement email;
	
	@FindBy(xpath="//input[@placeholder='Card number']")
	public WebElement cardNumber;
	
	@FindBy(xpath="//input[@placeholder='MM / YY']")
	public WebElement expDate;
	
	@FindBy(xpath="//input[@placeholder='CVC']")
	public WebElement cvvNumber;
	
	@FindBy(xpath="//input[@placeholder='ZIP Code']")
	public WebElement zip;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement payButton;
	
    @FindBy(xpath="//*[@id=\"container\"]/section/span[2]/div/div/main/div/header/h2")
    public WebElement title;
    
    @FindBy(xpath="//*[@class='Center-cell']")
    public WebElement smsText;
    
    
}
