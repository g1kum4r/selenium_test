package test.selenide.webpage;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;


public class Chapter1Page {

    private Chapter1Page() {
    }

    public SelenideElement getTextFromDivOnTheLeft() {
        return $("#divontheleft");
    }

    public HomePage goToHomePage() {
        $(By.linkText("Home Page")).click();
        return Selenide.page(HomePage.class);
    }


}
