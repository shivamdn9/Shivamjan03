package com.app.pages;

import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DownloadsPage {
    WebDriver driver;

    public DownloadsPage(WebDriver driver){
        this.driver = driver;
    }
    public void launchDownloads(){
        String expectedPageTitle = "Downloads | Selenium";
        driver.findElement(By.linkText("Downloads"));
        String actualPageTitle = driver.getTitle();
        Assert.assertEquals(expectedPageTitle,actualPageTitle);
    }
    public void verifyDownloadsHeader(){

    }
}
