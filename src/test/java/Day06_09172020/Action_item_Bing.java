package Day06_09172020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Action_item_Bing {

        public static void main(String[] args) throws InterruptedException {

            //set the chrome driver property
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

            //declaring and defining web driver
            WebDriver driver = new ChromeDriver();

            //dynamic array to loop
            String[] Sports = new String[5];
            Sports[0] = "Cricket";
            Sports[1] = "Soccer";
            Sports[2] = "Football";
            Sports[3] = "Baseball";
            Sports[4] = "Chess";

            //loop will start from here
            for (int i = 0; i< Sports.length; i++){

                //start window maximized
                driver.manage().window().maximize();
                //put two seconds delay
                Thread.sleep(2000);
                //navigate to bing home p[age
                driver.navigate().to("https://www.bing.com");
                Thread.sleep(2000);

                driver.findElement(By.id("sb_form_q")).sendKeys(Sports[i]);
                //click on search icon
                driver.findElement(By.xpath("//label[@aria-label='Search the web']")).click();

                //in order to capture a search result from the website you need to split 
                String message = driver.findElement(By.className("sb_count")).getText();

                //using array variable to split the search result
                String[] searchResult = message.split(" ");
                System.out.println("My Sport is " + Sports[1] + " My search result is " + searchResult[0]);
                Thread.sleep(2000);

            }//end of loop
            //quit the driver
            driver.quit();

        }//end of main method

    }//end of java class







