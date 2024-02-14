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

public class gitAddRemoveElement {
    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new EdgeDriver(); // initialize driver
    }
    @Test
    public void addRemoveElement(){
        driver.get("https://nearform.github.io/testing-playground/#/add-remove"); // open https://nearform.github.io/testing-playground/#/add-remove
        WebElement addElement = driver.findElement(By.className("css-1h0czj8")); // add 1 element
        addElement.click(); // click Add Element
        WebElement removeElement = driver.findElement(By.className("css-13uxj0c")); // remove 1 element
        removeElement.click(); // click Remove Element
    }
    @After
    public void tearDown() {
        driver.quit(); // close browser
    }
}
