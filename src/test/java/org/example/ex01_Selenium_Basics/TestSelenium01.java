package org.example.ex01_Selenium_Basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestSelenium01 {


    // Write the code which  will excute the UI automation
    @Test
    public void test_VerifyVMOLogin(){
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://github.com/vishvastav");
        driver.quit();
    }

}

