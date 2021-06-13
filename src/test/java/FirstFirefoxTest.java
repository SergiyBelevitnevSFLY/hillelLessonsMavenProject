import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirstFirefoxTest {


    @Test
    public void firstFirefoxTest(){

        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/geckodriver");

        WebDriver webDriver = new FirefoxDriver();
        webDriver.get("http://google.com");

    }
}
