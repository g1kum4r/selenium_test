package test.selenium.webpage;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;


public class Chapter1Page {

    private Chapter1Page() {
    }

    public SelenideElement getTextFromDivOnTheLeft() {
        return $("#divontheleft");
    }

    public HomePage goToHomePage() {
        $(By.linkText("Home Page")).click();
        return page(HomePage.class);
    }


}
