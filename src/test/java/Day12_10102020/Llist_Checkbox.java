package Day12_10102020;

import Reusable_Library.Reusable_Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;
import org.testng.annotations.Test;

import java.util.List;

public class Llist_Checkbox {

    @Test
    public void verifications() throws InterruptedException {

        WebDriver driver = Reusable_Methods.getDriver();

        driver.navigate().to("https://www.yahoo.com");
        Thread.sleep(2000);
        //get the count of all links in yahoo home page
        List<WebElement> linkCount = driver.findElements(By.xpath("//*[@class='_yb_5coqv']"));
        //print out the link count
        System.out.println("Link count is " + linkCount.size());

        //click on sign on button
        Reusable_Methods.click(driver,"//*[@class='_yb_687jt']","Sign In Button");
        Thread.sleep(2000);
        boolean checkboxState = driver.findElement(By.xpath("//*[@id='persistent']")).isSelected();
        //expecting the checkbox to be selected
        if (checkboxState == true) {
            System.out.println("Checkbox is selected as expected");
        }else {
            System.out.println("Checkbox is not Selected by default");

        }//end of if else


    }//end of test



}//end of java class
