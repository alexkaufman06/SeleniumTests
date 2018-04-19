package com.firsttest.webdriver;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

public class ParallelTest1 {
    @Test
    public void testChrome1() throws MalformedURLException {
        WebDriver driver = new DriverManager().getDriver("chrome");
        driver.navigate().to("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.close();
    }

    @Test
    public void testChrome2() throws MalformedURLException {
        WebDriver driver = new DriverManager().getDriver("chrome");
        driver.navigate().to("https://www.reddit.com/");
        driver.manage().window().maximize();
        driver.close();
    }

    @Test
    public void testFirefox1() throws MalformedURLException {
        WebDriver driver = new DriverManager().getDriver("firefox");
        driver.navigate().to("https://www.amazon.com");
        driver.manage().window().maximize();
        driver.close();
    }
}
