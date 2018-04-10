package com.firsttest.webdriver;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstTest {
    @Test
    public void startWebDriver() {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.facebook.com/");
        Assert.assertEquals("Title check failed!", "Facebook - Log In or Sign Up", driver.getTitle());
        driver.close();
        driver.quit();
    }
}
