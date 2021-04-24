package Reusable_Library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Reusable_Methods {
    public static WebDriver getDriver(){
        //set the chrome driver location
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        //setting the chrome options before defining the driver
        ChromeOptions Options = new ChromeOptions();
        //set the driver to be maximized
        Options.addArguments("start-maximized");
        //set the driver to be incognito mode(private)
        Options.addArguments("incognito");
        //run the driver in headless mode
        //option.addArguments(headless);

        //defining the web driver that you will be using
        WebDriver driver = new ChromeDriver(Options); //options variable should be passed here

        return driver;
    }//end of get driver

    //reusable method to click on any element on any websites
    public static void click(WebDriver driver, String locator,String elementName) {
        //define explicit wait
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            System.out.println("Clicking on element " + elementName);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator))).click();
        } catch (Exception err) {
            System.out.println("unable to click on element" + err);
        }//end of exception
    }//end of click method

    //reusable method to type on any element on any websites
    public static void sendkeys(WebDriver driver, String locator,String userValues,String elementName) {
        //define explicit wait
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            System.out.println("Typing on element " + elementName);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator))).sendKeys(userValues);
        } catch (Exception err) {
            System.out.println("unable to type on element" + err);
        }//end of exception
    }//end of sendkeys method

    //reusable method to submit on any element on any websites
    public static void submit(WebDriver driver, String locator,String elementName) {
        //define explicit wait
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            System.out.println("Submitting on element " + elementName);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator))).submit();
        } catch (Exception err) {
            System.out.println("unable to submit on element" + err);
        }//end of exception

    }//end of submit

        //reusable method to capture a value/text from a page
        public static String captureResult(WebDriver driver, String locator,String elementName) {
            //define explicit wait
            WebDriverWait wait = new WebDriverWait(driver, 10);
            String result ="";
            try {
                System.out.println("Capturing text on element " + elementName);
              result = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator))).getText();
            } catch (Exception err) {
                System.out.println("unable to capture on element" + err);
            }//end of exception

            return result;

        }//end of get result method

    //method to select from drop down menu
    public static void dropDownMenu(WebDriver driver,String locator,String userInput,String elementName){
        WebDriverWait wait = new WebDriverWait(driver,10);
        try {
            System.out.println("\nSelecting" + userInput + elementName);
            WebElement dropDown = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
            Select selectDropDown = new Select(dropDown);
            selectDropDown.selectByVisibleText(userInput);
        }
        catch (Exception err){
            System.out.println("\nUnable to select from drop down" + err);
        }
    }//end of drop down by text method

    public static void sendKeys(WebDriver driver, String s, String homeVal, String home_value) {
    }
}//end of java class
