package main.java.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import main.java.actions.CommonActions;
import main.java.pages.Pages;


public class WebDriverClass extends CommonActions {

Pages page = new Pages();
	
	WebDriver driver;

	String driverPath = "src/main/java/resources/chromedriver_80";

	public void initializeChromeDriver()
	{
		System.setProperty("webdriver.chrome.driver", driverPath);

		driver = new ChromeDriver();
		
		driver.get("http://weathershopper.pythonanywhere.com/");
		page.initializePages(driver);

	}
	
	public void switchWindow() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.switchTo().frame("stripe_checkout_app");
	}

	public void addToCartLowestSPF50()
	{
		int lowestSPF50 = selectSunscreensSPF50();
		driver.findElement(By.xpath("//p[contains(text(),'"+lowestSPF50+"')]//following-sibling::button")).click();;
	}
	
	public void addToCartLowestSPF30()
	{
		int lowestSPF30 = selectSunscreensSPF30();
		driver.findElement(By.xpath("//p[contains(text(),'"+lowestSPF30+"')]//following-sibling::button")).click();;
	}
	
	public void addToCartLowestAloe()
	{
		int lowestAloe = selectMoisturizerAloe();
		driver.findElement(By.xpath("//p[contains(text(),'"+lowestAloe+"')]//following-sibling::button")).click();;
	}
	
	public void addToCartLowestAlmond()
	{
		int lowestAlmond = selectMoisturizerAlmond();
		driver.findElement(By.xpath("//p[contains(text(),'"+lowestAlmond+"')]//following-sibling::button")).click();;
	}
	
	public void productCategory()
	{
		String category = categoryType();
		
		if(category.equalsIgnoreCase("moisturizers"))
		{
			addToCartLowestAloe();
			addToCartLowestAlmond();
		}
		else if (category.equalsIgnoreCase("suncreens"))
		{
			addToCartLowestSPF30();
			addToCartLowestSPF50();
		}
	}
	
	
}
