package book.theautomatedtester;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

/**
 * @author Jeevan
 */
public class HomePage {

    public Chapter1Page goToChapter1() {
        $(By.linkText("Chapter1")).click();
        return Selenide.page(Chapter1Page.class);
    }
}
