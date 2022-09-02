package pageObjects;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FirstPageObject extends BasePage {


    By draggable = By.id("draggable");
    By droppable = By.id("droppable");

    public FirstPageObject(WebDriver driver) {
        super(driver);
    }



    public void dragAndDropInTestApp(){


//        class = demoqa;
        switchToFrame(By.xpath("//*[@class='demo-frame']"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(driver.findElement(draggable),driver.findElement(droppable)).release().build().perform();

        WebElement draggableWebElemnt = driver.findElement(draggable);
        WebElement childOfDraggable = draggableWebElemnt.findElement(By.xpath("//*[@class='demoqa']"));
    }
}
