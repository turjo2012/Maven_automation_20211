package Day08_09262020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class metlife_switchtabs {

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

        driver.navigate().to("https:www.metLife.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@aria-label-'SOLUTIONS']")).click();
        //click on take along dental link
        driver.findElement(By.xpath("//*[text()='MetLife TakeAlong Dental']")).click();
        Thread.sleep(1500);
        //click on enroll now button
        driver.findElement(By.xpath("//*[contains(text(),'Enroll Now')]")).click();

        //need to store get window handles command in as ArrayList to switch to different tab(s)
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        //switch to second tab
        driver.switchTo().window(tabs.get(1));
        //enter the zipCode
        driver.findElement(By.xpath("//*[@name='txtZipCode']")).sendKeys("11218");
        driver.close(); //to close the new tab if you don't need it again
        //switch back to previous tab
        driver.switchTo().window(tabs.get(0));
        //renavigate back to met life
        driver.navigate().to("https://www.metLife.com");

    }//end of main method

}//end of java class
