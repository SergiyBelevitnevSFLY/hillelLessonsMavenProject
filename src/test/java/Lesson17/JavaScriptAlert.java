package Lesson17;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptAlert {

    @Test
    public void javaScriptAlert() throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        WebElement jsForClickAlert = driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']"));
        jsForClickAlert.click();

        Alert alert = driver.switchTo().alert();
        alert.sendKeys("some keys");

//        Thread.sleep(5000);
        alert.accept();

        driver.switchTo().defaultContent();

    }
}
