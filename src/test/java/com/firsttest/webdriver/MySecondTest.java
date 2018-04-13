package com.firsttest.webdriver;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MySecondTest {
    @Test
    public void startWebDriver() {
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://www.reddit.com/");
        Assert.assertEquals("Title check failed!", "reddit: the front page of the internet", driver.getTitle());
        driver.close();
    }
}
