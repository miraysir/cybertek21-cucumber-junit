package com.cybertek.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    private Driver(){} //Private Constructor
    //Stop being create object of this class we can give them the object we want
    //Object is WebDriver --> We are returning the object that way we want it
    //Driver driver = new Driver();

    private static WebDriver driver;

    public static WebDriver getDriver(){

        if (driver == null){

            String browser = ConfigurationReader.getProperty("browser");

            switch (browser){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver =new ChromeDriver();
                    break;
            }
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //This same driver will be returned everytime we call Driver.gerDriver() method
        return driver;
    }

    public static void closeDriver(){
        if(driver !=null){
            driver.quit();
            driver=null;

        }
    }




}
