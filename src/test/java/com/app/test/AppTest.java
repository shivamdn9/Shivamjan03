package com.app.test;

import com.app.pages.DocumentationPage;
import com.app.pages.DownloadsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AppTest {

    WebDriver driver;
    DownloadsPage downloads;
    DocumentationPage documentation;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\skuma871\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe\\");
        driver = new ChromeDriver();

        downloads= new DownloadsPage(driver);
        documentation = new DocumentationPage(driver);


        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/");
    }
    @Test
    public void verifyDownloadsPage(){
            downloads.launchDownloads();
    }
    @Test
    public void verifyDocumentationPage(){
            documentation.launchDocumentation();
    }
}
