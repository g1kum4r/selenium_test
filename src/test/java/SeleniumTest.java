import com.selenium.webdriver.java.model.page.Chapter1Page;
import com.selenium.webdriver.java.model.page.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumTest {

    WebDriver driver;

    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:/webdriver/chrome/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void test_01() throws InterruptedException {
        // Optional. If not specified, WebDriver searches the PATH for chromedriver.
        driver.get("http://book.theautomatedtester.co.uk/");
        HomePage homePage = new HomePage(driver);
        Thread.sleep(2000);  // Let the user actually see something!
        homePage.goToChapter1();
        Thread.sleep(2000);  // Let the user actually see something!
        Chapter1Page chapter1Page = new Chapter1Page(driver);
        Assert.assertEquals(chapter1Page.getTextFromDivOnTheLeft(), "Assert that this text is on the page");
        chapter1Page.goToHomePage();
        Thread.sleep(2000);  // Let the user actually see something!
    }

    @AfterTest
    public void quitDriver(){
        driver.quit();
    }
}
