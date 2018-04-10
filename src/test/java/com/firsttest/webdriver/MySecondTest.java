package com.firsttest.webdriver;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MySecondTest {
    @Test
    public void startWebDriver() {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.reddit.com/");
        Assert.assertEquals("Title check failed!", "reddit: the front page of the internet", driver.getTitle());
        driver.close();
        driver.quit();
    }
}
