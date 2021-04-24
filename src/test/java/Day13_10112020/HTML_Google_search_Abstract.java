package Day13_10112020;

import Reusable_Library.Abstract_Class;
import Reusable_Library.Reusable_Methods;
import Reusable_Library.Reusable_methods_Loggers;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;


    class HTML_Google_Search_Abstract extends Abstract_Class {

        private Reusable_methods_Loggers Reusable_Methods_Loggers;

        @Test(priority = 1)
        public void Google_Search() throws InterruptedException {
            logger.log(LogStatus.INFO, "Navigating to Google home page");
            driver.navigate().to("https://www.google.com");
            Thread.sleep(2000);
            Reusable_Methods_Loggers.sendKeys(driver, "//*[@name='q']", "Cars", logger, "Search Field");
            Reusable_Methods_Loggers.submit(driver, "//*[@name='btnK']", logger, "Search Button");
            Thread.sleep(2000);
        }//end of test

        @Test(dependsOnMethods = "Google_Search" )
        public void Google_Search_Result() throws InterruptedException {
            String result = Reusable_Methods_Loggers.captureResult(driver, "//*[@id='result-stats']", logger, "Search Result");
            String[] arrayResult = result.split(" ");
            logger.log(LogStatus.PASS, "My search number is " + arrayResult[1]);
            //after all the test steps per @Test you must end the test as well
        }//end of test


    }//end of java class




