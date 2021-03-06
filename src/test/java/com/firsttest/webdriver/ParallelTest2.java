package com.firsttest.webdriver;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

public class ParallelTest2 extends DriverManager {
    public String[] urls = {"https://www.reddit.com","https://www.google.com","https://www.npr.org"};
    int size = urls.length;

    @Test
    public void testChrome3() throws MalformedURLException {
        WebDriver driver = new DriverManager().getDriver("chrome");
        driver.navigate().to("https://www.yahoo.com");
        driver.manage().window().maximize();
        driver.close();
    }

    @After
    public void quitDriver() {
        driver.quit();
    }
}
