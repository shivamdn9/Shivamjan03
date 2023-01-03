package com.app.pages;

import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DocumentationPage {
    WebDriver driver;
    public DocumentationPage(WebDriver driver){
        this.driver = driver;
    }

    public void launchDocumentation(){
        String expectedPageTitle = "Documentation";
        driver.findElement(By.xpath("/html/body/div/div[1]/div/main/nav/ol/li/a"));
        String actualPageTitle = driver.getTitle();
        Assert.assertEquals(expectedPageTitle,actualPageTitle,"Document Page Not Loaded");
    }
}
