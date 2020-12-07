import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;
import test.selenide.webpage.Chapter1Page;
import test.selenide.webpage.HomePage;

public class BookTheAutomatedTesterTest {


    @Test
    public void testHomePageAndChapter1Page() {
//        Open the home page
        HomePage homePage = HomePage.open();
        try {
            Thread.sleep(2000);  // Let the user actually see something!
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        from Home Page, go to chapter 1 page
        Chapter1Page chapter1Page = homePage.goToChapter1();
        try {
            Thread.sleep(2000);  // Let the user actually see something!
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        Assert that the text exists on chapter 1 page
        chapter1Page.getDivOnTheLeft().shouldHave(Condition.text("Assert that this text is on the page"));

//       from Chapter 1 page, back to Home page
        chapter1Page.goToHomePage();
        try {
            Thread.sleep(2000);  // Let the user actually see something!
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
