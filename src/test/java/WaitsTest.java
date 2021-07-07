import base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WaitsTest extends BaseTest {



    @Test
    public void waitsTest() throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");
        driver.findElement(By.xpath("//button[normalize-space()='Start']")).click();

        WebDriverWait wait = new WebDriverWait(driver,7);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@id='loading']")));

        Assert.assertEquals(driver.findElement(By.cssSelector("div[id='finish'] h4")).getText(),"Hello World!");

        System.out.println("Test finished");

        driver.quit();
    }
}
