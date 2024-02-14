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

import java.util.List;

import static org.junit.Assert.*;

public class gitAddElement {
    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new EdgeDriver(); // initialize driver
    }
    @Test
    public void addElement(){
        driver.get("https://nearform.github.io/testing-playground/#/add-remove"); // open https://nearform.github.io/testing-playground/#/add-remove
            WebElement addElement = driver.findElement(By.className("css-1h0czj8")); // add Element
            addElement.click();

            WebElement isElement = driver.findElement(By.className("css-13uxj0c")); // look for added Elements
/*
            assertEquals("Is any added element divs present?", isElement.click());
*/

        
/*        assertEquals("Software Development Academy | Give IT a go!", driver.getTitle());
        assertNotEquals("Textul vechi al titlului! Xamolxes e smeq.", driver.getTitle());*/
    }
    @After
    public void tearDown() {
        driver.quit(); // close browser
    }
}
