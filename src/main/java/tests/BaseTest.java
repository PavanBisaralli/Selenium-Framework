package main.java.tests;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import main.java.modules.WebDriverClass;

public class BaseTest extends WebDriverClass{
	

@BeforeClass
public void initialize()
{
	initializeChromeDriver();
}


@Test
public void baseTest() throws InterruptedException, IOException
{
	checkTemparature();
	selectCategory();
	productCategory();
	proceedToCheckOut();
	clicOnPayButton();
	switchWindow();
	enterPaymentDetails();
	validateSuccessMessage();
}
}
