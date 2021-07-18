package Lesson17;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownHandling {

    @Test(groups = "TestGroup")
    public void dropDownTest(){

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/dropdown");


        WebElement dropDown = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropDown);
//        select;

        System.out.println("");
    }
}
