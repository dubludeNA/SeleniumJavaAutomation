package SeleniumJavaAutomation;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import static org.junit.jupiter.api.Assertions.*;

public class getTitleOfStrava {
    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new EdgeDriver();  // Edgedriver initialization
    }

    @Test
    public void testPrintTitleOnConsole() {
        driver.get("https://www.strava.com"); // Open https://www.strava.com
        System.out.println(driver.getTitle()); // Print the title in the console
        assertEquals("Strava | Running, Cycling & Hiking App - Train, Track & Share", driver.getTitle());
        assertNotEquals("This string is not true", driver.getTitle());
    }

    @After
    public void tearDown() {
        driver.quit(); // Close the browser
    }
}