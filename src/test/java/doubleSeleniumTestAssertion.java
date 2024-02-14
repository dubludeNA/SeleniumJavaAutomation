import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import static org.junit.Assert.assertEquals;

public class doubleSeleniumTestAssertion {
    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new EdgeDriver();  // ChromeDriver initialization
    }

    @Test
    public void TestPrintHRMOrangePageTitleOnConsole() {
        driver.get("https://opensource-demo.orangehrmlive.com/"); // open https://opensource-demo.orangehrmlive.com/

        // checking if the current page title is as expected
        assertEquals("OrangeHRM", driver.getTitle());
    }

    @After
    public void tearDown() {
        driver.quit(); // close browser
    }
}