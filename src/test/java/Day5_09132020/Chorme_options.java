package Day5_09132020;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chorme_options {
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

        //navigate to google page
        System.out.println("navigate to google home page");
        driver.navigate().to("htpps://www.google.com");
        //delay to 2 seconds
        Thread.sleep(2000);

        //capture the home page title and verify it matches the expected title
        //which is GOOGLE
        String acttualTitle = driver.getTitle();
        //verify it matches the expected title
        //end of main method
        if (acttualTitle == "GOOGLE") {
            System.out.println("title matches");
        } else {
            System.out.println("Title doesn't match. Actual title is" + acttualTitle);
        }//end of conditional statement

    }//end of main method


}//end of java class

