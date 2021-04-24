package Day09_09272020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Implicitwait_hulusite {
    public static void main(String[] args) {
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

        //set the implicit wait before your test steps
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //navigate to hulu
        driver.navigate().to("https://www.hulu.com");

        //click on start free trail
        //driver.findElement(By.xpath("//*[text()='START YOUR FREE TRAIL']")).click();
        //above text property didn't work because element not interactable
        //if this is the case then use another unique property
        driver.findElement(By.xpath("//*[@class='button--cta button--white Masthead__input-cta']")).click();



    }//end of main method

}//end of java class
