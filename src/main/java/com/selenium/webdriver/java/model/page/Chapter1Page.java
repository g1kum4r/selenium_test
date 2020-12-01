package com.selenium.webdriver.java.model.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Chapter1Page {

    private WebDriver webDriver;

    By textAssert = By.id("divontheleft");
    By homePageLink = By.linkText("Home Page");

    public Chapter1Page(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public String getTextFromDivOnTheLeft(){
        return webDriver.findElement(textAssert).getText();
    }

    public void goToHomePage(){
        webDriver.findElement(homePageLink).click();
    }


}
