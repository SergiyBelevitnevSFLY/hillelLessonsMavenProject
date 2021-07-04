package Lesson17;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IFrame {

    @Test
    public void iframe() {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/iframe");

        driver.switchTo().frame(driver.findElement(By.id("mce_0_ifr")));

        driver.findElement(By.xpath("//p[normalize-space()='Your content goes here.']")).sendKeys("some keys");

        driver.switchTo().defaultContent();


    }
}
