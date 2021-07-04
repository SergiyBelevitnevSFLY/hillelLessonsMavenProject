import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstSeleniumTest {

    @Test
    public void firstSeleniumTest(){


        String pathToRootOfProject = System.getProperty("user.dir");  // находит адсолютный путь корня проекта в системе

        String pathToChromeDriver = pathToRootOfProject + "/сhromedriver"; //указываем адсолютный путь где лежит chromedriver

        System.setProperty("webdriver.chrome.driver", pathToChromeDriver); //устанавливаем проперти чтобы селениум знал где лежит chromedriver

        WebDriver webDriver = new ChromeDriver(); // создание ссылки на драйвер
        webDriver.get("http://google.com");
//
    }
}
