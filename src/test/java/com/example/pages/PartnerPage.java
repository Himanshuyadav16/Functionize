package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PartnerPage extends BasePage {
    @FindBy(className = "faction")
    private WebElement loginButton;

    @FindBy(className = "factionol")
    private WebElement partnerButton;

    public PartnerPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void partnerLogin() {
        loginButton.click();
    }
    public void partner() {
        partnerButton.click();
    }
}
