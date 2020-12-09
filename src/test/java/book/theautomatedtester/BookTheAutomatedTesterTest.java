package book.theautomatedtester;

import com.codeborne.selenide.Condition;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static com.codeborne.selenide.Selenide.open;

/**
 * @author Jeevan
 */
public class BookTheAutomatedTesterTest {

    private final String KEY_HOME_URL = "booktheautomatedtester.home.url";
    private final String APPLICATION_TEST_PROPERTY_FILE = "application.test.properties";

    Properties properties = null;

    @BeforeSuite
    public void beforeSuit() throws IOException {
        properties = new Properties();
        properties.load(new FileInputStream(getClass().getClassLoader().getResource(APPLICATION_TEST_PROPERTY_FILE).getFile()));
    }

    @Test
    public void testHomePageAndChapter1Page() {
//        Open the home page
        HomePage homePage = open(properties.getProperty(KEY_HOME_URL), HomePage.class);

//        from Home Page, go to chapter 1 page
        Chapter1Page chapter1Page = homePage.goToChapter1();

//        Assert that the text exists on chapter 1 page
        chapter1Page.getDivOnTheLeft().shouldHave(Condition.text("Assert that this text is on the page"));

//       from Chapter 1 page, back to Home page
        chapter1Page.goToHomePage();
    }

}
