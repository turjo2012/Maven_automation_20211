package Day06_09192020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class yahoo_with_findElements {
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
        //delay 2 second
        Thread.sleep(2000);
        /*
        storing search field locator as a WebElement variable so i can re use that locator more than once
         */

        WebElement searchField = driver.findElement(By.xpath("//*[@name='p']"));
        //clear any pre defined value on the field
        searchField.clear();
        //enter your new keyword
        searchField.sendKeys("cars");
        //submit on the same field after the value
        searchField.submit();

        //using find element to click on 3 link(news)
        //driver.findElements.(By.xpath("//*[@class='_yb_e4mte ']")).get(2).click();





    }//end of main method

}//end of java class
