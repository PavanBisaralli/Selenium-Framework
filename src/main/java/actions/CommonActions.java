package main.java.actions;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import main.java.pages.Pages;

public class CommonActions {

	WebDriver driver;

	String typeOfProduct = "";

	public String checkTemparature()
	{

		String temparature = Pages.cartPage.currentTemparature.getText();

		temparature = temparature.replaceAll("[^\\d]", " "); 
		temparature = temparature.trim(); 

		System.out.println("temp is"+temparature);
		String shopOption = null;

		if(Integer.parseInt(temparature) < 18)
		{
			shopOption = "moisturizers";
		}
		else if (Integer.parseInt(temparature) > 34)
		{
			shopOption = "suncreens";
		}
		else
		{
			System.out.println("Temperature Conditon not satisfied");
		}

		return shopOption;
	}

	public void selectCategory()
	{
		String categoryToSelect = checkTemparature();

		if(categoryToSelect.contains("moisturizers"))
		{
			Pages.cartPage.moisturizersOption.click();
			typeOfProduct = "moisturizers";
		}
		else if(categoryToSelect.contains("suncreens"))
		{
			Pages.cartPage.suncreensOption.click();
			typeOfProduct = "suncreens";
		}
	}

	public String categoryType()
	{
		return typeOfProduct;
	}

	public void proceedToCheckOut()
	{
		String cartItem = Pages.listingPage.cartButton.getText();

		if(cartItem.contains("item"))
		{
			Pages.listingPage.cartButton.click();
		}
	}

	public void clicOnPayButton()
	{
		Pages.listingPage.payButton.click();
	}




	public void enterPaymentDetails() throws InterruptedException, IOException
	{

		FileReader reader=new FileReader("src/main/java/resources/local.properties");  

		Properties prop=new Properties();  
		prop.load(reader);  
		Thread.sleep(5000);
		Pages.paymentPage.email.sendKeys(prop.getProperty("email"));
		Thread.sleep(5000);
		Pages.paymentPage.smsText.click();
		Thread.sleep(5000);
		Pages.paymentPage.cardNumber.sendKeys(prop.getProperty("cardNumber"));
		Pages.paymentPage.cvvNumber.sendKeys(prop.getProperty("cvvNumber"));
		Pages.paymentPage.expDate.sendKeys(prop.getProperty("expDate"));
		Pages.paymentPage.zip.sendKeys(prop.getProperty("zip"));
		Pages.paymentPage.payButton.click();
	}


	public void validateSuccessMessage() throws InterruptedException
	{
		Thread.sleep(5000);
		String successMesg = Pages.resultPage.successMessage.getText();
		boolean status = successMesg.contains("PAYMENT SUCCESS");
		Assert.assertTrue(status);
	}


	public int selectSunscreensSPF30()
	{
		List<String> labelsListName = new ArrayList<>();
		List<Integer> labelsListPrice = new ArrayList<>();


		for (WebElement webElement : Pages.listingPage.selectSPF30) {
			labelsListName.add(webElement.getText());
		}

		for (WebElement webElement : Pages.listingPage.selectSPF30Price) {
			String lowestPrice = webElement.getText();
			lowestPrice = lowestPrice.replaceAll("[^\\d]", " "); 
			lowestPrice = lowestPrice.trim(); 
			labelsListPrice.add(Integer.parseInt(lowestPrice));
		}

		int min = labelsListPrice.get(0) ;
		for (int i : labelsListPrice){
			min = min < i ? min : i;
		}
		return min;
	}

	public int selectSunscreensSPF50()
	{
		List<String> labelsListName = new ArrayList<>();
		List<Integer> labelsListPrice = new ArrayList<>();


		for (WebElement webElement : Pages.listingPage.selectSPF50) {
			labelsListName.add(webElement.getText());
		}

		for (WebElement webElement : Pages.listingPage.selectSPF50Price) {
			String lowestPrice = webElement.getText();
			lowestPrice = lowestPrice.replaceAll("[^\\d]", " "); 
			lowestPrice = lowestPrice.trim(); 
			labelsListPrice.add(Integer.parseInt(lowestPrice));
		}

		int min = labelsListPrice.get(0) ;
		for (int i : labelsListPrice){
			min = min < i ? min : i;
		}
		return min;
	}

	public int selectMoisturizerAloe()
	{
		List<String> labelsListName = new ArrayList<>();
		List<Integer> labelsListPrice = new ArrayList<>();


		for (WebElement webElement : Pages.listingPage.selectAloe) {
			labelsListName.add(webElement.getText());
		}

		for (WebElement webElement : Pages.listingPage.selectAloePrice) {
			String lowestPrice = webElement.getText();
			lowestPrice = lowestPrice.replaceAll("[^\\d]", " "); 
			lowestPrice = lowestPrice.trim(); 
			labelsListPrice.add(Integer.parseInt(lowestPrice));
		}

		int min = labelsListPrice.get(0) ;
		for (int i : labelsListPrice){
			min = min < i ? min : i;
		}
		return min;
	}

	public int selectMoisturizerAlmond()
	{
		List<String> labelsListName = new ArrayList<>();
		List<Integer> labelsListPrice = new ArrayList<>();


		for (WebElement webElement : Pages.listingPage.selectAlmond) {
			labelsListName.add(webElement.getText());
		}

		for (WebElement webElement : Pages.listingPage.selectAlmondPrice) {
			String lowestPrice = webElement.getText();
			lowestPrice = lowestPrice.replaceAll("[^\\d]", " "); 
			lowestPrice = lowestPrice.trim(); 
			labelsListPrice.add(Integer.parseInt(lowestPrice));
		}

		int min = labelsListPrice.get(0) ;
		for (int i : labelsListPrice){
			min = min < i ? min : i;
		}
		return min;
	}

}

