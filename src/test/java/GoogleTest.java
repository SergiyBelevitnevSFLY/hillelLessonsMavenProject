import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleTest {



    @Test
    public void someTest() throws InterruptedException {
        By searchInput = By.xpath("//input[@title='Search']");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://google.com");
        driver.findElement(searchInput).sendKeys("lhvelrhgoer");
        Thread.sleep(3000);
        Dimension dimension = driver.findElement(searchInput).getSize();

        Point point = driver.findElement(searchInput).getLocation();
        driver.findElement(searchInput).click();

        System.out.println("");


    }
}
