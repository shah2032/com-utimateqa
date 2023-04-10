package BrowserTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiBrowserTest {
    static String browser = "Edge";
    static String baseUrl ="https://courses.ultimateqa.com/users/sign_in";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new ChromeDriver();

        } else {
            System.out.println("Wrong Browser name");
        }
        driver.manage().window().maximize();
        driver.get(baseUrl);
        System.out.println(driver.getTitle());
        //Get the Current URL
        System.out.println("Current URL :" + driver.getCurrentUrl());
        //Get Page Source
        System.out.println("Page source :" + driver.getPageSource());
        //Find the Email Field Element
        WebElement EmailField = driver.findElement(By.id("user[email]"));
        //Type the Email address to Email field element
        EmailField.sendKeys("prime123@gmail.com");

        driver.findElement(By.name("user[password]")).sendKeys("Prime123");
        //Close the Browser
        //   driver.close();
        //  driver.quit//
          }

    }







