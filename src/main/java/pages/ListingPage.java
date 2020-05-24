package main.java.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ListingPage {

	@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/button")
	public WebElement addToCart;
	
	@FindBy(xpath="/html/body/nav/ul/button")
	public WebElement cartButton;
	
	@FindBy(xpath="/html/body/div[1]/div[3]/form/button/span")
	public WebElement payButton;
	
	@FindBy(xpath="//p[contains(text(),'SPF-50') or contains(text(),'spf-50')]")
	public List<WebElement> selectSPF50;
	
	@FindBy(xpath="//p[contains(text(),'SPF-30') or contains(text(),'spf-30')]")
	public List<WebElement> selectSPF30;
	
	@FindBy(xpath="//p[contains(text(),'SPF-50') or contains(text(),'spf-50')]//following-sibling::p")
	public List<WebElement> selectSPF50Price;
	
	@FindBy(xpath="//p[contains(text(),'SPF-30') or contains(text(),'spf-30')]//following-sibling::p")
	public List<WebElement> selectSPF30Price;
	
	
	@FindBy(xpath="//p[contains(text(),'Aloe') or contains(text(),'aloe')]")
	public List<WebElement> selectAloe;
	
	@FindBy(xpath="//p[contains(text(),'Almond') or contains(text(),'almond')]")
	public List<WebElement> selectAlmond;
	
	@FindBy(xpath="//p[contains(text(),'Aloe') or contains(text(),'aloe')]//following-sibling::p")
	public List<WebElement> selectAloePrice;
	
	@FindBy(xpath="//p[contains(text(),'Almond') or contains(text(),'Almond')]//following-sibling::p")
	public List<WebElement> selectAlmondPrice;	

}
