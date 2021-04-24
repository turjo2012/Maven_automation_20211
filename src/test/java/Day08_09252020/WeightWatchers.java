package Day08_09252020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class WeightWatchers {
    public static void main(String[] args) throws InterruptedException {

        //set the chrome driver location
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        //setting the chrome options before defining the driver
        ChromeOptions Options = new ChromeOptions();
        //set the driver to be maximized
        Options.addArguments("start-maximized","incognito");
        //set the driver to be incognito mode(private)
        //run the driver in headless mode
        //option.addArguments(headless);

        //defining the web driver that you will be using
        WebDriver driver = new ChromeDriver(Options); //options variable should be passed here

        //Create an array list to store 3 different actual zipCode
        String[] zipCode = new String[3];
        zipCode[0] = "11208";
        zipCode[1] = "10013";
        zipCode[2] = "11368";


        //using loop i want to iterate through all zipCode and click on each one
        for (int i = 0; i <zipCode.length; i++){
            //navigate to weightWatchers site
            driver.navigate().to("https://www.weightwatchers.com");
            Thread.sleep(2000);
            //verify the title of the page with the actual title
            //i will use if else statement to verify the title of the page

            String verifyTitle = driver.getTitle();
            if (verifyTitle.equals("Weight Watchers:Weight loss & Welness help")){
                System.out.println("Title match with the expected title");
            } else {
                System.out.println("Title does not match" + verifyTitle);
            }//end of if else

            //click on find a workshop
            driver.findElement(By.xpath("//a[@id='ela-menu-visitor-desktop-supplementa_find-a-workshop']")).click();
            Thread.sleep(2000);
            //locating the search field and the search button and the sending keys
            driver.findElement(By.xpath("//*[@id='location-search']")).sendKeys(zipCode[i]);
            Thread.sleep(2000);
            //click on the search button
            driver.findElement(By.xpath("//*[@id='location-search-cta']")).click();
            //click on the zipCode field using the if and else condition
            String linkElement = "//*[@class='loction_name']";
            //if else condition will start from here
            //if the zipCode = 0 then click on the 2nd link
            if (i==0){
            driver.findElements(By.xpath("//a[@class='linkUnderline-1_h4g']")).get(1).click();
            //storing the element as a string and locating the studio address and getting the text
                String studioLink = driver.findElement(By.xpath("//*[@class='location']")).getText();
                //printing out the studio address associated with the zipCode
                System.out.println("My zipCode is" + zipCode[0] + "My address: + studioLink");
                Thread.sleep(2000);
            }
            //if the zipCode is = 1 then click on the 3rd link
            if (i==1){
                driver.findElements(By.xpath(linkElement)).get(2).click();
                //Storing the element as string and locating the studio address and getting the text
                String studioLink1 = driver.findElement(By.xpath("//*[@class='loction']")).getText();
                //printing out the studio address associated with the zipCode
                System.out.println("My zipCode is:" + zipCode[1] + "My studio address is:" + studioLink1);
                Thread.sleep(2000);
            }
            //if the zipCode is = 2 then click on the 1st link
            if (i==2){
                driver.findElements(By.xpath("linkElement")).get(0).click();
                //storing the element as a string and locating the studio address and getting the text
                String studioLink2 = driver.findElement(By.xpath("//*[@class='location']")).getText();
                //printing out the studio address associated with the zipCode
                System.out.println("My zipCode is " + zipCode[2] + "My studio address is:" + studioLink2);
                Thread.sleep(2000);
            }//end of if conditions

            //storing the table element as a string sp i can use it on the print statement and locating the element and getting the text
            String tableLink = driver.findElement(By.xpath("//*[@class='meeting-schedule meeting-detail-bottom-section']")).getText();
            //printing out the schedule for the each studios
            System.out.println("Virtual studio hours are:" + tableLink);
            Thread.sleep(2000);

        }//end of for loop

        driver.quit();

    }//end of main method

}//end of java class
