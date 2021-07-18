package pageObjects;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {


    public WebDriver driver;
    public BasePage(WebDriver driver) {
        this.driver=driver;
    }

    @Step("{}")
    public void allureLog(String message){
        System.out.println(message);
    }
    public void switchToFrame(By locator){
        driver.switchTo().frame(driver.findElement(locator));
    }
}
