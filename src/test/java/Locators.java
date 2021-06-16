import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Locators {



    @Test
    public void locatorsExample() throws InterruptedException {




        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://en.wikipedia.org/wiki/Document_Object_Model");


        Thread.sleep(2000);

        By locatorCSSExample = By.cssSelector("label[for='toctogglecheckbox']");
        WebElement webElementExample = driver.findElement(locatorCSSExample);
        webElementExample.click();

        Thread.sleep(7000);

        By locatorXpathExample = By.xpath("//a[normalize-space()='JScript']");
        WebElement webElementXpathExample = driver.findElement(locatorXpathExample);
        webElementXpathExample.click();



    }
}
