package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    private WebDriver driver;

    @BeforeMethod
    public void driverSetup(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        setDriver(driver);
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    @AfterMethod
    public void driverQuit(){
        getDriver().quit();
    }
}
