import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstSeleniumTest {

    @Test
    public void firstSeleniumTest(){


        String pathToRootOfProject = System.getProperty("user.dir");
        System.out.println(pathToRootOfProject);

        String pathToChromeDriver = pathToRootOfProject + "/chromedriver";

        System.setProperty("webdriver.chrome.driver", pathToChromeDriver);

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://google.com");
//
    }
}
