package BrowserTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest {
    public static void main(String[] args) {
        String baseUrl =  "https://courses.ultimateqa.com/users/sign_in";

        //Launch the Chrome Browser
        WebDriver driver = new ChromeDriver();
        //Open the URL into Browser
        driver.get(baseUrl);
        //Get the Title of the Page
        String title = driver.getTitle();
        System.out.println(title);
        //Get the Current URL
        System.out.println("Current URL :" + driver.getCurrentUrl());
        //Get Page Source
        System.out.println("Page source :" + driver.getPageSource());
        //Find the Email Field Element
        WebElement EmailField = driver.findElement(By.id("user[email]"));
        //Type the Email address to Email field element
        EmailField.sendKeys("prime123@gmail.com");

        driver.findElement(By.id("user[password]")).sendKeys("Prime123");
        //Close the Browser
     //   driver.close();
      //  driver.quit();

    }

}




