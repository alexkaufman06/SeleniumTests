package com.firsttest.webdriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;


public class DriverManager {
    public WebDriver driver;

    public WebDriver getDriver(String browser) throws MalformedURLException {
        ChromeOptions options = new ChromeOptions();
        return driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options);
    }
}
