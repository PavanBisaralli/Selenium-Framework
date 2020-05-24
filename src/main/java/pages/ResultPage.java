package main.java.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultPage {

    @FindBy(xpath="/html/body/div/div[1]/h2")
    public WebElement successMessage;
}

