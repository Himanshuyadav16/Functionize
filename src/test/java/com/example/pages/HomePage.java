package com.example.pages;

import com.example.utils.ApplicationProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;

public class HomePage extends BasePage {
    public String BaseUrl = ApplicationProperties.INSTANCE.getUrl();

    @FindBy(className = "free-trial-url")
    private WebElement freeTrail;

//    @FindBy(xpath = "//*[contains(div,'Company')]")
    @FindBy(xpath = "//*[@id='w-dropdown-toggle-3']/div[2]")
    private WebElement company;

//    @FindBy(xpath = "//*[contains(a,'Partners')]")
    @FindBy(xpath = "//*[@id='w-dropdown-list-3']/div/div[2]/a[3]")
    private WebElement partner;

   // @FindBy(xpath = "//*[contains(div,'Resources')]")
   @FindBy(xpath = "//*[@id='w-dropdown-toggle-2']/a/div")
    private WebElement resource;

    //@FindBy(xpath = "//*[contains(a,'eBooks')]")
    @FindBy(xpath = "//*[@id='w-dropdown-list-2']/div/div[2]/a[3]")
    private WebElement ebooks;

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void showFrontPage() {
        driver.get(BaseUrl);
         String ActualTitle = driver.getTitle();
        String ExpectedTitle = "AI Test Automation with Machine Learning | Functionize";
        assertThat(ActualTitle, equalToIgnoringCase(ExpectedTitle));
    }

    public void freeTrail() {
        showFrontPage();
        freeTrail.click();
    }

    public void company() {
        showFrontPage();
        Actions actions = new Actions(driver);
        actions.moveToElement(company).perform();
        partner.click();
    }
    public void resource(){
        showFrontPage();
        Actions actions = new Actions(driver);
        actions.moveToElement(resource).perform();
        ebooks.click();
    }

}