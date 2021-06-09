import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FirstTest extends ParentTest {


    @Test
    public void hillelFirstAwesomeTest(){
        SoftAssert softAssert = new SoftAssert();
        System.out.println("TEST 1 Hello world first test");
        softAssert.assertTrue(false,"---First test failed!!!!");
        String expectedString = "Banana";
        String actualString = "Apple";
        softAssert.assertEquals(actualString, expectedString, "Strings are different");
        softAssert.assertNull(expectedString);

        softAssert.assertAll();


//        Assert.
    }

    @Test
    public void hillelSecondAwesomeTest(){
        System.out.println("TEST 2 Hello world");
        Assert.assertFalse(false);
    }

    @Test
    public void firstUnitTest(){

        UnitTestExample unitTestExample = new UnitTestExample();
        String input = "unit test";
        String expected = "UNIT TEST";

        Assert.assertEquals(unitTestExample.toUpperCase(input), expected);
    }


}
