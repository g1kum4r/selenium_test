package test.selenide.webpage;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;


/**
 * Chapter 1 Page
 */
public class Chapter1Page {

    private Chapter1Page() {
    }

    /**
     * @return SelenideElement selenide element, div on the left in chapter 1 page
     */
    public SelenideElement getDivOnTheLeft() {
        return $("#divontheleft");
    }

    /**
     * @return HomePage return to HomePage from chapter 1, through clicking the Home Page link
     */
    public HomePage goToHomePage() {
        $(By.linkText("Home Page")).click();
        return Selenide.page(HomePage.class);
    }


}
