package com.example.testCases;

import com.example.BaseClass;
import com.example.pages.FormFill;
import com.example.pages.HomePage;
import com.example.pages.PartnerPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class FunctionizeTest extends BaseClass {
    @Test
    public void homePageTest()  {
        WebDriver driver=getDriver();
        HomePage homePage = new HomePage(driver);
        homePage.showFrontPage();
    }
    @Test
    public void frontPageTest() throws InterruptedException {
        WebDriver driver=getDriver();
        HomePage homePage = new HomePage(driver);
        homePage.freeTrail();
        FormFill formFill=new FormFill(driver);
        formFill.fillForm();
    }
    @Test
    public void resourceTest(){
        WebDriver driver=getDriver();
        HomePage homePage = new HomePage(driver);
        homePage.resource();
    }
    @Test
    public void companyTest(){
        WebDriver driver=getDriver();
        HomePage homePage = new HomePage(driver);
        homePage.company();
    }
    @Test
    public void partnerLoginTest(){
        WebDriver driver=getDriver();
        HomePage homePage = new HomePage(driver);
        homePage.company();
        PartnerPage partnerPage=new PartnerPage(driver);
        partnerPage.partnerLogin();
    }

    @Test
    public void partnerTest(){
        WebDriver driver=getDriver();
        HomePage homePage = new HomePage(driver);
        homePage.company();
        PartnerPage partnerPage=new PartnerPage(driver);
        partnerPage.partner();
    }


}