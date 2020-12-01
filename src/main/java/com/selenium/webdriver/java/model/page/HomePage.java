package com.selenium.webdriver.java.model.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver webDriver;

    By chapter1_Link = By.linkText("Chapter1");

    public HomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void goToChapter1(){
        webDriver.findElement(chapter1_Link).click();
    }
}
