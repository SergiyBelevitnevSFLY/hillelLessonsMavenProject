import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class ParentTest {

    @BeforeTest(dependsOnMethods = "secondSomeCodeBeforeTest")
    public void someCodeBeforeTest(){
        System.out.println("Some code before test");
    }

    @BeforeTest
    public void secondSomeCodeBeforeTest(){
        System.out.println("Second method before test");
    }

    @BeforeMethod
    public void someCodeBeforeMethod(){
        System.out.println("------------>Some code before method");
    }

    @AfterTest
    public void someCodeAfterTest(ITestContext context1){
//        ITestResult iTestResult1 = iTestResult;
        ITestContext context = context1;
        System.out.println("***** After test performed");
    }

    @AfterMethod
    public void anyName(){
        System.out.println(" ###### After method performed");
    }

}
