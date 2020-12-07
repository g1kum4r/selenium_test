package test.selenide.webpage;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class HomePage {

    private static HomePage homePage = null;

    private HomePage() {
    }

    public static HomePage open() {
        if (homePage == null) {
            homePage = Selenide.open("http://book.theautomatedtester.co.uk/", HomePage.class);
        }
        return homePage;
    }

    public Chapter1Page goToChapter1() {
        $(By.linkText("Chapter1")).click();
        return page(Chapter1Page.class);
//        chapter1Link.click();
    }
}
