import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class BaseTest {



    @AfterMethod
    public void afterMethod(ITestResult iTestResult){
        long time = iTestResult.getEndMillis() - iTestResult.getStartMillis();
        System.out.println("Time of test run is " + time);
    }
}
