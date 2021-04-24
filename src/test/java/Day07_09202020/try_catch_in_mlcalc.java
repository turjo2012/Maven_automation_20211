package Day07_09202020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class try_catch_in_mlcalc {
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

        //navigate to mlcalc
        driver.navigate().to("https://www.mlcalc.com");
        Thread.sleep(2000);

        //clear and enter purchase price
        try {
            WebElement dPayment = driver.findElement(By.xpath("//*[@name='ma']"));
            dPayment.clear();
            dPayment.sendKeys("400000");
        } catch (Exception err) {
            System.out.println("unable to enter value on purchase price " + err);
        }//end of purchase price exception

        //clear and enter down payment
        try {
            WebElement dPayment = driver.findElement(By.xpath("//*[@name='dp']"));
            dPayment.clear();
            dPayment.sendKeys("40");
        } catch (Exception err) {
            System.out.println("unable to enter value on purchase price " + err);
        }//end of down payment

        //Select a start month
        try {
            WebElement startMonth = driver.findElement(By.xpath("//*[@name='sm']"));
            Select smList = new Select(startMonth);
            smList.selectByVisibleText("Feb");
        } catch (Exception err) {
            System.out.println("unable to select to start month " + err);
        }//end of payment exception

        //click on calculate
        try {
             driver.findElement(By.xpath("//*[@alt='Calculate']")).click();
        } catch (Exception err) {
            System.out.println("unable to click on Calculate button " + err);

        }//end of Calculate exception

    }//end of main method

}//end of java class
