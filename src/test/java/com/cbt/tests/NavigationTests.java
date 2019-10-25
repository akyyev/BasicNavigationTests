package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;


public class NavigationTests {

    public static void main(String[] args) {


        //WebDriver driver = BrowserFactory.getDriver("safari");
        WebDriver driver = BrowserFactory.getDriver("chrome");
        //WebDriver driver = BrowserFactory.getDriver("firefox");
        //WebDriver driver = BrowserFactory.getDriver("edge"); // Exception in thread "main" java.lang.NullPointerException


        driver.get("http://google.com");

        String title1 = driver.getTitle();
        driver.navigate().to("https://etsy.com");
        String title2 = driver.getTitle();

        driver.navigate().back();
        StringUtility.verifyEquals(title1, driver.getTitle());

        driver.navigate().forward();
        StringUtility.verifyEquals(title2, driver.getTitle());

        driver.close();
    }



}
