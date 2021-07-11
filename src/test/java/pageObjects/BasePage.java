package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {


    public WebDriver driver;
    public BasePage(WebDriver driver) {
        this.driver=driver;
    }


    public void switchToFrame(By locator){
        driver.switchTo().frame(driver.findElement(locator));
    }
}
