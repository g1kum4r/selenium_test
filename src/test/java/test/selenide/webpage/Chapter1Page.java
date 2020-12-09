package test.selenide.webpage;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

/**
 * @author Jeevan
 */
public class Chapter1Page {

    public SelenideElement getDivOnTheLeft() {
        return $("#divontheleft");
    }

    public HomePage goToHomePage() {
        $(By.linkText("Home Page")).click();
        return page(HomePage.class);
    }

}
