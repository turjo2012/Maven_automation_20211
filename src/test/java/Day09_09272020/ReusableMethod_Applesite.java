package Day09_09272020;

import Reusable_Library.Reusable_Methods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ReusableMethod_Applesite {
    public static void main(String[] args) throws InterruptedException {

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

        driver.navigate().to("https://www.apple.com");
        //calling the reusable click method for clicking on mac link
        Reusable_Methods.click(driver,"//*[@data-analytics-title='mac']","Mac Link");
        //click on macbook air
        Reusable_Methods.click(driver,"//*[text()='MacBook Air']","Mac Book Air");
        //click on search icon
        //Thread.sleep(2000);
        Reusable_Methods.click(driver,"//*[@id='ac-gn-link-search']","search Icon");
        //entering a keyword on search field
        Reusable_Methods.sendkeys(driver,"//*[@placeholder='search apple.com']","iphone","search field");
        //hit submit
        Reusable_Methods.submit(driver,"//*[@placeholder='search apple.com']","search field");
        

    }//end of main method

}//end of java class
