package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class FirstPageObject {

    private WebDriver driver;

    By draggable = By.id("draggable");
    By droppable = By.id("droppable");

    public FirstPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public void dragAndDropInTestApp(){

        Actions actions = new Actions(driver);
        actions.dragAndDrop(driver.findElement(draggable),driver.findElement(droppable)).release().build().perform();
    }
}
