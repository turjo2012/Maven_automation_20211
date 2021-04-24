package Day09_09272020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class USPS_MouseActions {
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

        //navigate to usps.com
        driver.navigate().to("https:www.usps.com");
        Thread.sleep(2000);

        //declare your mouse actions command
        Actions actions = new Actions(driver);

        //move your mouse to quick tools to open dropdown
        WebElement quickTools = driver.findElement(By.xpath("//*[text()='Quick Tools']"));
        actions.moveToElement(quickTools).perform();
        //click on track a package using actions
        WebElement trackPackage = driver.findElement(By.xpath("//*[text()='Track a Package']"));
        actions.moveToElement(trackPackage).click().perform();
        //entering tracking number
        Thread.sleep(3500);
        WebElement trackNumber = driver.findElement(By.xpath("//*textarea[@id='tracking-input']"));
       //actions.moveToElement(trackNumber).sendKeys("1112232344").perform();
        trackNumber.sendKeys("111111");

    }//end of main method

}//end of java class
