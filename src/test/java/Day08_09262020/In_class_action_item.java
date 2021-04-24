package Day08_09262020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class In_class_action_item {
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

        ArrayList<String> searchboxList = new ArrayList<>();
        searchboxList.add("Miami");
        searchboxList.add("Las vegas");
        searchboxList.add("Florida");

        ArrayList<String> checkinList = new ArrayList<>();
        checkinList.add("09-28-2020");
        checkinList.add("10-28-2020");
        checkinList.add("11-28-2020");

        for (int i = 0; i < searchboxList.size(); i++) {

            //navigate to Hotels site
            driver.navigate().to("https://www.Hotels.com");
            Thread.sleep(2000);
            try {
                WebElement searchbox = driver.findElement(By.xpath("//*[@name='q-destination']"));
                searchbox.clear();
                searchbox.sendKeys(searchboxList.get(i));

            } catch (Exception err) {
                System.out.println("Unable to enter destination name" + err);
            }//end of searchbox exception

            try {
                //Thread.sleep(2000);
                driver.findElements(By.xpath("//*[contains(@class,'autosuggest-category-result']")).get(0).click();
                Thread.sleep(1000);

            } catch (Exception err) {
                System.out.println("unable to click on suggestion list" + err);
            }//end of autosuggestion exception

            try {
                //enter check in date
                //Thread.sleep(1000);
                WebElement checkin = driver.findElement(By.xpath("//*[contains(@data-input,'location-check-in']"));
                checkin.click();
                Thread.sleep(1000);
                checkin.clear();
                checkin.sendKeys(checkinList.get(i));
                Thread.sleep(2000);
            } catch (Exception err) {
                System.out.println("Unable to enter check in date");
            }//end of try and catch for check in date

            //entering check out date
            try {
                System.out.println("Entering a check out date");
                WebElement checkOut = driver.findElement(By.xpath("//*[@name='q-localised-check_out')]"));
                Thread.sleep(2000);
                checkOut.clear();
                checkOut.sendKeys(checkinList.get(i));
                Thread.sleep(1000);
            } catch (Exception err) {
                System.out.println("Unable to enter check out date");
            }//end of try and catch for check out date

        }//end of for loop

    }///end of main method

}//end//end of java class

