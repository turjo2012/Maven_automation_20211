package Day11_10042020;

import Reusable_Library.Reusable_Methods;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNG_Google_Search {

    //call before suite to set up your chromedriver
    // precondition
    //driver need to be initialized outside of all method so it can be reusable
WebDriver driver = null;
@BeforeSuite
public void setChromeDriver() {
    driver = Reusable_Methods.getDriver();
}//end of before suite

    @Test(priority = 1)
    public void searchKeyword() throws InterruptedException{
    driver.navigate().to("https://www.google.com");
    Thread.sleep(2000);
    Reusable_Methods.sendkeys(driver,"//*[@name='q']","cars","Search Field");
    Reusable_Methods.submit(driver,"//*[@name='btnk']","Search Field");
    Thread.sleep(2000);

    }//end of test 1

    @Test(priority = 2)
    public void getSearchResult(){
    String result = Reusable_Methods.captureResult(driver,"//*[@id='result-stats']","Result");
    System.out.println("My Search result is " + result);
    }//end of test 2

    @AfterSuite
    public void closeDriver() {
        driver.quit();

    }//end of after suite

}//end of java class
