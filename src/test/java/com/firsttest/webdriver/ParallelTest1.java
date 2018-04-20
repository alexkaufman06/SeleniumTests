package com.firsttest.webdriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;

public class ParallelTest1 {
    @Test
    public void testChrome1() throws MalformedURLException {
        WebDriver driver = new DriverManager().getDriver("chrome");
        driver.navigate().to("https://www.fisherinvestments.com/en-us/campaigns/99rt/la");
        WebElement Button = driver.findElement(By.className("btn-Landing2"));
        Button.click();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement firstNameInput;
        firstNameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("DesktopForm_TXT_FIRST_NAME")));
        firstNameInput.sendKeys("test");
        driver.close();
    }

    @Test
    public void testChrome2() throws MalformedURLException {
        WebDriver driver = new DriverManager().getDriver("chrome");
        driver.navigate().to("https://www.fisherinvestments.com/en-us/campaigns/ai/lb");
        WebElement Button = driver.findElement(By.className("btn-Landing2"));
        Button.click();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement firstNameInput;
        firstNameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("DesktopForm_TXT_FIRST_NAME")));
        firstNameInput.sendKeys("test");
        driver.close();
    }

    @Test
    public void testFirefox1() throws MalformedURLException {
        WebDriver driver = new DriverManager().getDriver("firefox");
        driver.navigate().to("https://www.fisherinvestments.com/en-us/campaigns/air/lx");
        WebElement Button = driver.findElement(By.className("btn-Landing2"));
        Button.click();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement firstNameInput;
        firstNameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("DesktopForm_TXT_FIRST_NAME")));
        firstNameInput.sendKeys("test");
        driver.close();
    }
}
