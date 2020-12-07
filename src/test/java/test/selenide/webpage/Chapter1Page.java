package test.selenide.webpage;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;


/**
 * @author Jeevan
 */
public class Chapter1Page {

    private Chapter1Page() {
    }

    /**
     * @return SelenideElement
     */
    public SelenideElement getDivOnTheLeft() {
        return $("#divontheleft");
    }

    /**
     * @return HomePage
     */
    public HomePage goToHomePage() {
        $(By.linkText("Home Page")).click();
        return Selenide.page(HomePage.class);
    }


}
