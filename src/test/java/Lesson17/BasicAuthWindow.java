package Lesson17;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasicAuthWindow {

    @Test
    public void basicAuthWindow(){
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
//        driver.get("http://the-internet.herokuapp.com/basic_auth");
        driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
                        //Login:Password
        System.out.println("");
    }
}
