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

        //Step 3- Assertion: Check its title is correct
        //assertEquals method Parameters: Message, Expected Value, Actual Value
        Assert.assertEquals("Title check failed!", "reddit: the front page of the internet", driver.getTitle());

        //Step 4- Close Driver
        driver.close();

        //Step 5- Quit Driver
        driver.quit();
    }
}
