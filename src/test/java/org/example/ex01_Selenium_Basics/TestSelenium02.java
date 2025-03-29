package org.example.ex01_Selenium_Basics;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium02 {


    // Write the code which  will excute the UI automation
    @Test
    public void test_VerifyVMOLogin(){
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com");

        //Asser the url-validation TestNG Assertation
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");

        driver.quit();
    }

}

