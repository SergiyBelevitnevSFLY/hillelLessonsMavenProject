import base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WebDriverMangerExample extends BaseTest {

    @Test()
    @Description("startBrowserWithManager test")
      public void startBrowserWithManager() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();

        allureLog("Opening google.com");
        driver.get("http://google.com");


        By locatorOfGoogleSearch = By.cssSelector("input[title='Search']");
        WebElement inputGoogleSearch = driver.findElement(locatorOfGoogleSearch);
        allureLog("Searching query");
        inputGoogleSearch.sendKeys("Hillel school in Kharkiv");
        inputGoogleSearch.submit();

        By hillelSchoolLinkLocator = By.xpath("//h3[contains(text(),'Компьютерная школа Hillel в Харькове: курсы IT тех')]");
        WebElement hillelSchoolLink = driver.findElement(hillelSchoolLinkLocator);
        hillelSchoolLink.click();

        driver.manage().deleteAllCookies();
        driver.quit();


        //        WebDriverManager.firefoxdriver().setup();
//        WebDriver driver = new FirefoxDriver();
//        driver.get("http://google.com");
    }
}
