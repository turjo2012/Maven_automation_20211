package Day06_09192020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpath_concepts {
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
        WebDriver driver = new ChromeDriver(); //options variable should be passed here

        //navigate to yahoo page
        driver.navigate().to("https:www.yahoo.com");
        //delay 2 seconds
        Thread.sleep(2000);
        //locate search field by id or name
        driver.findElement(By.xpath("//*[contains(@id,'ybar-sbq') or @name='p']")).sendKeys("cars");
        //navigate to yahoo page
        driver.navigate().to("https://www.yahoo.com");
        //delay 2 seconds
        Thread.sleep(2000);
        //using contains to only specify matching word within a property to locate an element
        driver.findElements(By.xpath("//*[contains(@class,'yb_e4mte')]")).get(2).click();

    }//end of main method

}//end of java class
