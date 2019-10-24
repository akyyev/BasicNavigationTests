package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification {

    public static void main(String[] args) {
        List<String> urls = Arrays.asList("http://practice.cybertekschool.com",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");

        WebDriver driver = BrowserFactory.getDriver();

        driver.get(urls.get(0));
        String title1 = driver.getTitle();

        driver.get(urls.get(1));
        String title2 = driver.getTitle();

        driver.get(urls.get(2));
        String title3 = driver.getTitle();


        System.out.println((title1.equals(title2) && title2.equals(title3))? "Pass" : "Fail");

        driver.close();
    }
}
