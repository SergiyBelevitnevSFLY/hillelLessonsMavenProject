package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
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
    public void driverQuit(ITestResult iTestResult){
        if (iTestResult.getStatus() == ITestResult.FAILURE)
        {
            System.out.println("*****Taking Screenshot");
            saveScreenshotPNG();

        }
        getDriver().quit();
    }

    @Step("{}")
    public void allureLog(String message){
        System.out.println(message);
    }

    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] saveScreenshotPNG() {
        return ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
    }
}
