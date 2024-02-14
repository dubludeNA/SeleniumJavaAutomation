package SeleniumJavaAutomation;
import net.bytebuddy.asm.Advice;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.openqa.selenium.Keys.*;

public class getWatchInSearchBar {
    private WebDriver driver;
    @Before
    public void setUp() {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void testSearchBar() throws InterruptedException {
        WebElement searchInput; // Defineste variabila pt bara de cautare
        driver.get("https://www.trisport.ro"); // Deschide pagina

        Thread.sleep(3000); // Lasa o pauza de 3s

        WebElement cookies; // Acceptam cookies
        cookies = driver.findElement(By.id("gdpr-cookie-accept"));
        cookies.click();
        // Manipulam bara de cautare
        searchInput = driver.findElement(By.name("search"));
        searchInput.click();
        searchInput.sendKeys("Coros Apex 2 Pro");
        searchInput.sendKeys(ENTER);

        // Selectam elementul dorit si apasam click
        WebElement produseAfisate = driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[2]/div[1]/div/div[1]"));
        produseAfisate.click();

        WebElement titluProdus = driver.findElement(By.cssSelector(".title.page-title"));
        assertEquals("COROS APEX 2 PRO - CEAS GPS MULTISPORT PREMIUM - VERDE", titluProdus.getText());
        assertNotEquals("This is not your product", titluProdus.getText());
    }
    @After
        public void tearDown() {
            driver.quit(); // inchidem browseru
        }
}
