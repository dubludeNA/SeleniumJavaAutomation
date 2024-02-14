package nearFormAutomation;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import static org.junit.Assert.*;

import java.util.List;

public class gitCheckbox {
    private WebDriver driver;

    @Before
    public void setUp(){
        driver = new EdgeDriver(); // initialize driver
    }

    @Test
    public void checkBox(){
        driver.get("https://nearform.github.io/testing-playground/#/check-box");
        List<WebElement> checked = driver.findElements(By.xpath("//input[@type='checkbox']"));
        WebElement firstCheckBox = checked.get(0);

        firstCheckBox.click();

        if (!firstCheckBox.isSelected()){
            System.out.println("checkbox selectat");
            return;
        }
        assertFalse("checkboxu e bifat. fail cu succes", firstCheckBox.isSelected());


      /*  assertEquals("Software Development Academy | Give IT a go!", driver.getTitle());
        assertNotEquals("Textul vechi al titlului! Xamolxes e smeq.", driver.getTitle());*/
    }
/*    @After
    public void tearDown() {
        driver.quit(); // close browser
    }*/
}
