package Lesson17;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckBoxes {

    @Test
    private void checkBoxes(){


        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/checkboxes");

        WebElement secondCheckBox = driver.findElement(By.xpath("//input[2]"));
        System.out.println("The check box " + secondCheckBox.isSelected());

        secondCheckBox.click();

        System.out.println("The check box " + secondCheckBox.isSelected());

    }
}
