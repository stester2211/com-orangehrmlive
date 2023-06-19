package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser
{
    public static void main(String[] args) throws InterruptedException {
        String baseUrl="https://opensource-demo.orangehrmlive.com/";

        //1. Setup Chrome Browser
        WebDriver driver=new ChromeDriver();

        //2. Open URL
        driver.get(baseUrl);

        //Maximize the screen
        driver.manage().window().maximize();

        //Implicit wait time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //3. Print the title of the page
        System.out.println("--------------------------------------");
        System.out.println("3. Page title is : "+driver.getTitle());

        //4. Print the current URL
        System.out.println("4. Current URL is : "+driver.getCurrentUrl());

        //5. Print the page source
        System.out.println("5. Page source is :"+driver.getPageSource());

        //6. Enter the email to email field
        //6.1 Get the email element
        WebElement usernameField= driver.findElement(By.name("username"));

        //6.2 Action is to type email
        usernameField.sendKeys("vpatel5632@gmail.com");

        //7. Enter the password to the password field
        //7.1 Find the password element
        WebElement passwordField= driver.findElement(By.name("password"));

        //7.2 Action is to type the password
        passwordField.sendKeys("v123");

        //Hold the screen for sometime
        Thread.sleep(2000);

        //8. Close the browser
        driver.close();


    }
}
