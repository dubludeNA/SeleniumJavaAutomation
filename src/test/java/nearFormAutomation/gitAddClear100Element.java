package nearFormAutomation;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import static org.junit.Assert.*;

public class gitAddClear100Element {
    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new EdgeDriver(); // initialize driver
    }
    @Test
    public void addClearStorage(){
        driver.get("https://nearform.github.io/testing-playground/#/add-remove"); // open https://nearform.github.io/testing-playground/#/add-remove
        for(int i = 1; i <= 100; i ++) {
            WebElement addElement = driver.findElement(By.className("css-1h0czj8")); // select element
            addElement.click(); // click Add Element
        }
        WebElement clearStorage = driver.findElement(By.className("css-rtmjoa")); // select clear storage
        clearStorage.click(); // click Add Element
    }
    @After
    public void tearDown() {
        driver.quit(); // close browser
    }
}
