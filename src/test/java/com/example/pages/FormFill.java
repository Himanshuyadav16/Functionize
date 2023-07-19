package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FormFill extends BasePage {
    @FindBy(name = "firstname")
    private WebElement firstName;
    @FindBy(name = "lastname")
    private WebElement lastName;
    @FindBy(name = "email")
    private WebElement email;
    @FindBy(name = "phone")
    private WebElement phone;
    @FindBy(name = "company")
    private WebElement company;
    @FindBy(name = "job_role")
    private WebElement jobRole;
    @FindBy(name = "total_size_of_test_suite")
    private WebElement testSuite;
    @FindBy(name = "any_upcoming_projects_that_require_test_automation_")
    private WebElement testAutomation;
    @FindBy(css = "input[value='Digital Experience Monitoring with AI']")
    private WebElement interestedCheckUp;
    @FindBy(css = "input[value='Yes']")
    private WebElement yes;
    @FindBy(name = "terms_and_conditions")
    private WebElement agreeClick;
    @FindBy(name = "input[value='Submit']")
    private WebElement submitButton;

    public FormFill(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void fillForm() throws InterruptedException {
        Thread.sleep(2000);
        firstName.sendKeys("UserName");
        lastName.sendKeys("LastName");
        email.sendKeys("user12@gmail.com");
        phone.sendKeys("9988776655");
        company.sendKeys("velliya");
        Select select = new Select(jobRole);
        select.selectByValue("Software Engineer");
        Select selectTestSuite = new Select(testSuite);
        selectTestSuite.selectByValue("501-1000");
        Select selectTestAutomation = new Select(testAutomation);
        selectTestAutomation.selectByValue("Redesign");
        Thread.sleep(2000);
        interestedCheckUp.click();
        Thread.sleep(2000);
        yes.click();
        Thread.sleep(2000);
        agreeClick.click();
        Thread.sleep(2000);
        submitButton.click();
    }

}
